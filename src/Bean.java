import org.primefaces.event.RowEditEvent;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.util.ArrayList;

@ManagedBean( name = "bean" )
@SessionScoped
public class Bean {
    private ArrayList< Contacto > contactos = new ArrayList<>( );
    private ArrayList< Contacto > temp_for_clean = new ArrayList<>( );
    private String nombre, apellido, correo, telefono, direccion;
    private String contact_names, contact_last_names;

    public Bean( ){
        contactos.add( new Contacto( "Cesar", "Mendez", "Calle 9A", "809-744-4433", "acmdsfdined@gfsfl.com" ) );
        contactos.add( new Contacto( "Carlos", "Batista", "Calle S7", "809-809-8090", "bsn34@gmdsd.com" ) );
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public String getNombre() {
        return apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return apellido;
    }

    public String getTelefono() {
        return apellido;
    }

    public String getDireccion() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContact_last_names() {
        return contact_last_names;
    }

    public String getContact_names() {
        return contact_names;
    }

    public void setContact_last_names(String contact_last_names) {
        this.contact_last_names = contact_last_names;
    }

    public void setContact_names(String contact_names) {
        this.contact_names = contact_names;
    }

    public String eliminar( ){
        for( Contacto c : contactos ){
            if( c.isSelected( ) ){
                temp_for_clean.add( c );
            }
        }

        if( temp_for_clean.size() > 0 ) {
            contactos.removeAll(temp_for_clean);
            temp_for_clean.clear();
            FacesContext.getCurrentInstance().addMessage( null, new FacesMessage( "Usuario/s eliminado/s" ) );
        }
        return "index";
    }

    public void agregar( ){
        if( contact_names.length() == 0 || contact_last_names.length() == 0 ){
            FacesContext.getCurrentInstance().addMessage( null, new FacesMessage( "Datos incorrectos!" ) );
            return;
        }

        //if( error )
        Contacto contacto = new Contacto( contact_names, contact_last_names, "", "", "" );
        contactos.add( contacto );
    }

    public void actualizar( RowEditEvent event ){
        Contacto c = ( Contacto ) event.getObject( );
        c.setNombre( nombre );
        c.setApellido( apellido );
        c.setCorreo( correo );
        c.setDireccion( direccion );
        c.setTelefono( telefono);
        FacesContext.getCurrentInstance().addMessage( null, new FacesMessage( "Usuario actualizado!" ) );
    }

    public void cancelar( RowEditEvent event ){
        FacesContext.getCurrentInstance().addMessage( null, new FacesMessage( "Acción cancelada!" ) );
    }
}
