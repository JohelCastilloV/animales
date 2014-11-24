import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lucero on 24/11/2014.
 */

@RestController
public class AnimalRestService {

    @Autowired
    AnimalService animalService;



    @RequestMapping("/animal")
    public Animal mostrarAnimal(@RequestParam(value="sonido", defaultValue="miau") String sonido ) {
        return animalService.obtenerAnimal(sonido);
    }


}
