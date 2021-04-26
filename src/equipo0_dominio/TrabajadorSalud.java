
package equipo0_dominio;

import com.google.gson.annotations.Expose;
import java.util.Date;

/**
 *
 * @author dianacastro
 */
public class TrabajadorSalud extends Usuario{
    @Expose
    private String cedula;
    @Expose
    private String primerApellido;
    @Expose
    private String segundoApellido;
    @Expose
    private String nombre;
    @Expose
    private String sexo;
    @Expose
    private Date fechaNacimiento;
    @Expose
    private String lugarTrabajo;

    public TrabajadorSalud(String username, String password) {
        super(username, password);
    }

    public TrabajadorSalud(String cedula, String primerApellido, String segundoApellido, String nombre, String sexo, Date fechaNacimiento, String lugarTrabajo, String username, String password) {
        super(username, password);
        this.cedula = cedula;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }
    
    
    
}
