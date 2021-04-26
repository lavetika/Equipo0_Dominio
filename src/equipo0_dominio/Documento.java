
package equipo0_dominio;

import com.google.gson.annotations.Expose;

/**
 *
 * @author dianacastro
 */
public class Documento {
    @Expose
    private String contenido;

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
