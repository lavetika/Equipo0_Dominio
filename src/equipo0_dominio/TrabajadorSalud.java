
package equipo0_dominio;

import java.util.Date;

/**
 *
 * @author dianacastro
 */
public class TrabajadorSalud {
    private String cedula;
    private String primerApellido;
    private String segundoApellido;
    private String nombre;
    private String sexo;
    private Date fechaNacimiento;
    private String estadoNacimiento;
    private String nacionalidad;
    private String municipio;
    private String localidad;
    private String lugarTrabajo;

    public TrabajadorSalud() {
    }

    public TrabajadorSalud(String cedula, String primerApellido, String segundoApellido, String nombre, String sexo, Date fechaNacimiento, String estadoNacimiento, String nacionalidad, String municipio, String localidad, String lugarTrabajo) {
        this.cedula = cedula;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoNacimiento = estadoNacimiento;
        this.nacionalidad = nacionalidad;
        this.municipio = municipio;
        this.localidad = localidad;
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

    public String getEstadoNacimiento() {
        return estadoNacimiento;
    }

    public void setEstadoNacimiento(String estadoNacimiento) {
        this.estadoNacimiento = estadoNacimiento;
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

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }
    
    
    
}
