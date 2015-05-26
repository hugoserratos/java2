
package encapsulamiento;


public class ProbarEncapsulamiento {

    
    public static void main(String[] args) {
     Usuario u1=new Usuario();
    //2. segunda regla de encapsulamiento, para asignar valor a cada atributo implementa en la clase un metodo
    //mutador, siempre tiene qe ser publico
     //Asignaciones tienen qe hacerse siempre por medio de metodos
     u1.setEdad(21);
     System.out.println("tu edad es: "+u1.getEdad());
     
     
    }
    
}
