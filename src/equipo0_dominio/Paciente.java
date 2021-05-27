
package equipo0_dominio;

import com.google.gson.annotations.Expose;
import java.awt.Image;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dianacastro
 */
@Entity
public class Paciente extends Usuario{

    private static final long serialVersionUID = 1141232617244959151L;
    
    @Expose
    private String curp;
    @Expose
    private String primerApellido;
    @Expose
    private String segundoApellido;
    @Expose
    private String nombre;
    @Expose
    private String sexo;
    @Expose
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Expose
    private Paciente tutor;
    @Expose
    private String tokenFirebase;

    public Paciente() {
    }
    
    public Paciente(String username, String password) {
        super(username, password);
    }

    public Paciente(String curp, String primerApellido, String segundoApellido, String nombre, String sexo, Date fechaNacimiento, Paciente tutor, String username, String password, String tokenFirebase) {
        super(username, password);
        this.curp = curp;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.tutor = tutor;
        this.tokenFirebase=tokenFirebase;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
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

    public Paciente getTutor() {
        return tutor;
    }

    public void setTutor(Paciente tutor) {
        this.tutor = tutor;
    }

    public String getTokenFirebase() {
        return tokenFirebase;
    }

    public void setTokenFirebase(String tokenFirebase) {
        this.tokenFirebase = tokenFirebase;
    }
    
    public String getNombreCompleto(){
        return this.nombre+" "+this.primerApellido+" "+this.segundoApellido;
    }
}
