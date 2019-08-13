public class PruebaEncapsulamiento {
    public static void main(String[] args) {
         Persona persona1 = new Persona("juan","carlos",true);
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        System.out.println("persona1.getApellido() = " + persona1.getApellido());
        System.out.println("persona1.isBorrado() = " + persona1.isBorrado());
        System.out.println("persona1.toString() = " + persona1.toString());
    }
}
