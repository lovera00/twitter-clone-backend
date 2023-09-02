import java.util.UUID;
import java.sql.Timestamp;
import java.util.Date;

public class Tweet {
    private final UUID id;
    private String content;
    private final UUID profileId;
    private final Timestamp createdAt;
    private Timestamp updatedAt;

    public Tweet(String content, UUID profileId) {
        if (content.isEmpty() || content.length() > 140) {
            throw new IllegalArgumentException("El contenido del tweet debe tener entre 1 y 140 caracteres.");
        }

        this.id = UUID.randomUUID();
        this.content = content;
        this.profileId = profileId;
        this.createdAt = new Timestamp(new Date().getTime());
        this.updatedAt = this.createdAt;
    }

    public UUID getId() {
        return this.id;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }
}
