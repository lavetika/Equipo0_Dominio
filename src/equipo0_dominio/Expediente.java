
package equipo0_dominio;

import com.google.gson.annotations.Expose;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author dianacastro
 */
@Entity
public class Expediente extends EntityBase{

    private static final long serialVersionUID = -9064052962396846542L;
    @Expose
    private Paciente paciente;
    @Expose
    private List<Documento> documentos;

    public Expediente() {
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }
}
