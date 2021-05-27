
package equipo0_dominio;

import com.google.gson.annotations.Expose;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author dianacastro
 */
@Entity
public class TrabajadorSalud extends Usuario{

    private static final long serialVersionUID = 4268667195222309581L;
    @Expose
    private String cedula;
    @Expose
    private String primerApellido;
    @Expose
    private String segundoApellido;
    @Expose
    private String nombre;
    @Expose
    private String lugarTrabajo;

    public TrabajadorSalud() {
    }
    
    public TrabajadorSalud(String username, String password) {
        super(username, password);
    }

    public TrabajadorSalud(String cedula, String primerApellido, String segundoApellido, String nombre, String lugarTrabajo, String username, String password) {
        super(username, password);
        this.cedula = cedula;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombre = nombre;
        this.lugarTrabajo = lugarTrabajo;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }
    
    public String getNombreCompleto(){
        return this.nombre+" "+this.primerApellido+" "+this.segundoApellido;
    }
    
}
