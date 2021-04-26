package equipo0_dominio;

import com.google.gson.annotations.Expose;

/**
 *
 * @author Alfonso Felix
 */
public class FirebaseCloudMessage {

    @Expose
    private NotificationData data;
    @Expose
    private String to;
    @Expose
    private final boolean direct_boot_ok = true;

    public FirebaseCloudMessage() {
    }

    public FirebaseCloudMessage(NotificationData data, String to) {
        this.data = data;
        this.to = to;
    }

    public NotificationData getData() {
        return data;
    }

    public void setData(NotificationData data) {
        this.data = data;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public boolean isDirect_boot_ok() {
        return direct_boot_ok;
    }
}
