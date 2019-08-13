public class Persona {
   private String nombre;
   private String apellido;
   private boolean borrado;

    public Persona(String nombre, String apellido, boolean borrado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.borrado = borrado;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public  String toString(){
        return "Nombre:"+ nombre + "Apellido: " + apellido + "borrado" + borrado ;
    }
}
