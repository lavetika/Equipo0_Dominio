
package equipo0_dominio;

import com.google.gson.annotations.Expose;
import java.util.List;

/**
 *
 * @author dianacastro
 */
public class Expediente {
    
    @Expose
    private int id;
    @Expose
    private Paciente paciente;
    @Expose
    private List<Documento> documentos;
    
}
