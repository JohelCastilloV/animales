import CLIPSJNI.Environment;
import CLIPSJNI.PrimitiveValue;
import org.springframework.stereotype.Service;

/**
 * Created by lucero on 24/11/2014.
 */
@Service
public class AnimalService {

Environment clips;
      AnimalService(){
      clips = new Environment();
      clips.load("animalitos.clp");

      }
    public Animal obtenerAnimal(String sonido) {

        String nombre = null;
        try {
        if("miau".equals(sonido)){
            System.out.println("aqui si normal");
            PrimitiveValue eval = clips.eval("(assert (sonido miau))");
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

        nombre="";
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
