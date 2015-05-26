
package encapsulamiento;


public class Usuario {
    //1. primer regla, poner ls atributos con modificador privado
    
    private String nombre;
     private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

 

}
