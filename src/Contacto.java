/**
 * Created by AcMined on 9/15/2016.
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String Direccion;
    private String Telefono;
    private String Correo;

    public Contacto(String nombre, String apellido,String Direccion,String Telefono,String Correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Correo = Correo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}
