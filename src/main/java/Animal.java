import CLIPSJNI.Environment;

/**
 * Created by johel on 24/11/2014.
 */
public class Animal {

    String nombre;
    String sonido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public Animal(String nombre, String sonido) {
        this.nombre = nombre;
        this.sonido = sonido;
    }
}
