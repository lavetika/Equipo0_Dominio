
package equipo0_dominio;

import java.util.Date;

/**
 *
 * @author dianacastro
 */
public class Cita {
    private int id;
    private Paciente paciente;
    private TrabajadorSalud trabSalud;
    private Date fecha;
    private boolean aceptada;

    public Cita() {
    }

    public Cita(int id, Paciente paciente, TrabajadorSalud trabSalud, Date fecha, boolean aprobada) {
        this.id = id;
        this.paciente = paciente;
        this.trabSalud = trabSalud;
        this.fecha = fecha;
        this.aceptada = aprobada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public TrabajadorSalud getTrabSalud() {
        return trabSalud;
    }

    public void setTrabSalud(TrabajadorSalud trabSalud) {
        this.trabSalud = trabSalud;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isAprobada() {
        return aceptada;
    }

    public void setAprobada(boolean aprobada) {
        this.aceptada = aprobada;
    }
    
    
    
}
