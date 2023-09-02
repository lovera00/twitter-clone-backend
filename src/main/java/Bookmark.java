import java.util.UUID;
import java.sql.Timestamp;
import java.util.Date;

public class Bookmark {
    private final UUID id;
    private final UUID userId;
    private final UUID tweetId;
    private final Timestamp createdAt;

    public Bookmark(UUID userId, UUID tweetId) {
        this.id = UUID.randomUUID();
        this.userId = userId;
        this.tweetId = tweetId;
        this.createdAt = new Timestamp(new Date().getTime());
    }

    public UUID getId(){
        return this.id;
    }
    public UUID getUserId() {
        return this.userId;
    }

    public UUID getTweetId() {
        return this.tweetId;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }
}