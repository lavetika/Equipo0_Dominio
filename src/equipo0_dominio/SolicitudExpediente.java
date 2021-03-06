
package equipo0_dominio;

import com.google.gson.annotations.Expose;
import java.util.Date;

/**
 *
 * @author dianacastro
 */
public class SolicitudExpediente {
    @Expose
    private int idCita;
    @Expose
    private String nombreSolicitante;
    @Expose
    private Date fechaHora;

    public SolicitudExpediente(int idCita, String nombreSolicitante, Date fechaHora) {
        this.idCita = idCita;
        this.nombreSolicitante = nombreSolicitante;
        this.fechaHora = fechaHora;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
}
