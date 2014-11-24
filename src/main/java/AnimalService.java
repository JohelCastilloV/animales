import CLIPSJNI.Environment;
import CLIPSJNI.PrimitiveValue;
import org.springframework.stereotype.Service;

/**
 * Created by johel on 24/11/2014.
 */
@Service
public class AnimalService {

Environment clips;
      AnimalService(){
      clips = new Environment();


      }
    public Animal obtenerAnimal(String sonido) {
        clips.load("animalitos.clp");
        String nombre = null;
        try {
        if("miau".equals(sonido)){
            System.out.println("aqui si normal");
            PrimitiveValue eval = clips.eval("(assert (sonido miau))");
            System.out.println("carajo "+eval.toString());
        }

        if("guau".equals(sonido)){
            clips.eval("(assert (sonido guau))");
        }
        if("cua".equals(sonido)){
            clips.eval("(assert (sonido cua))");
        }
        if("mu".equals(sonido)){
            clips.eval("(assert (sonido mu))");
        }

        clips.run();

        String evaluar ="(find-all-facts ((?v animal)) TRUE)";
        PrimitiveValue value=clips.eval(evaluar);
        System.out.println("donde me caigo");

        nombre="";

            System.out.println("tamales ");
            System.out.println("que sale "+value.getValue().toString());
             nombre=value.get(0).getFactSlot("nombre").toString();
        } catch (Exception e) {
            System.out.println("entre porfin");
            clips.reset();
            e.printStackTrace();
        }
        clips.reset();
        Animal animal = new Animal(nombre,sonido);
        return animal;
    }
}
