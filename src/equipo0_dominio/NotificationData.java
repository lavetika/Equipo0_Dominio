/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo0_dominio;

import com.google.gson.annotations.Expose;
import java.util.Date;

/**
 *
 * @author Alfonso Felix
 */
public class NotificationData {
    @Expose
    private int idCita;
    @Expose
    private String nombreSolicitante;
    @Expose
    private Date fechaHora;
    @Expose
    private boolean aprobada;
    @Expose
    private String body;

    public NotificationData() {
    }

    public NotificationData(int idCita, String nombreSolicitante, Date fechaHora, boolean aprobada, String body) {
        this.idCita = idCita;
        this.nombreSolicitante = nombreSolicitante;
        this.fechaHora = fechaHora;
        this.aprobada = aprobada;
        this.body = body;
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

    public boolean isAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
