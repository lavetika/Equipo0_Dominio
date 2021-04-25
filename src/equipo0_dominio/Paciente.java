
package equipo0_dominio;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author dianacastro
 */
public class Paciente {
    
    private String curp;
    private String primerApellido;
    private String segundoApellido;
    private String nombre;
    private String sexo;
    private Date fechaNacimiento;
    private String estadoNacimiento;
    private Image foto;
    private String nacionalidad;
    private String municipio;
    private String localidad;
    private Paciente tutor;

    public Paciente() {
    }

    public Paciente(String curp, String primerApellido, String segundoApellido, String nombre, String sexo, Date fechaNacimiento, String estadoNacimiento, Image foto, String nacionalidad, String municipio, String localidad, Paciente tutor) {
        this.curp = curp;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoNacimiento = estadoNacimiento;
        this.foto = foto;
        this.nacionalidad = nacionalidad;
        this.municipio = municipio;
        this.localidad = localidad;
        this.tutor = tutor;
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

    public String getEstadoNacimiento() {
        return estadoNacimiento;
    }

    public void setEstadoNacimiento(String estadoNacimiento) {
        this.estadoNacimiento = estadoNacimiento;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Paciente getTutor() {
        return tutor;
    }

    public void setTutor(Paciente tutor) {
        this.tutor = tutor;
    }
    
    
    
    
}
