package equipo0_dominio;

import com.google.gson.annotations.Expose;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Alfonso Felix
 */
@MappedSuperclass
public class Usuario extends EntityBase{

    private static final long serialVersionUID = -7207309932827633426L;
    @Expose
    private String username;
    @Expose
    private String password;

    public Usuario() {
    }
    
    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
