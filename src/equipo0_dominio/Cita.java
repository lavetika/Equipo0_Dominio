
package equipo0_dominio;

import com.google.gson.annotations.Expose;
import java.util.Date;

/**
 *
 * @author dianacastro
 */
public class Cita {
    @Expose
    private int id;
    @Expose
    private Paciente paciente;
    @Expose
    private TrabajadorSalud trabSalud;
    @Expose
    private Date fecha;
    @Expose
    private boolean aceptada;
    @Expose
    private boolean expedienteAprobado=false;
    @Expose
    private boolean expedienteVisiblePaciente=true;

    public Cita() {
    }

    public Cita(int id, Paciente paciente, TrabajadorSalud trabSalud, Date fecha, boolean aceptada) {
        this.id = id;
        this.paciente = paciente;
        this.trabSalud = trabSalud;
        this.fecha = fecha;
        this.aceptada = aceptada;
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

    public boolean isAceptada() {
        return aceptada;
    }

    public void setAceptada(boolean aceptada) {
        this.aceptada = aceptada;
    }

    public boolean isExpedienteAprobado() {
        return expedienteAprobado;
    }

    public void setExpedienteAprobado(boolean expedienteAprobado) {
        this.expedienteAprobado = expedienteAprobado;
    }

    public boolean isExpedienteVisiblePaciente() {
        return expedienteVisiblePaciente;
    }

    public void setExpedienteVisiblePaciente(boolean expedienteVisiblePaciente) {
        this.expedienteVisiblePaciente = expedienteVisiblePaciente;
    }
}
