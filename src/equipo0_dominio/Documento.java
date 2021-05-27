
package equipo0_dominio;

import com.google.gson.annotations.Expose;
import javax.persistence.Entity;

/**
 *
 * @author dianacastro
 */
@Entity
public class Documento extends EntityBase{

    private static final long serialVersionUID = 1876641548806795896L;
    @Expose
    private String contenido;

    public Documento() {
    }
    
    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
