import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.UUID;
import java.sql.Timestamp;

public class LikeTest {
    @Test
    public void testLikeShouldAssociateWithUserAndTweet() {
        UUID userId = UUID.randomUUID();
        UUID tweetId = UUID.randomUUID();
        Like like = new Like(userId, tweetId);

        assertEquals(userId, like.getUserId());
        assertEquals(tweetId, like.getTweetId());
    }

    @Test
    public void testLikeShouldRegisterCreationDate() {
        Like like = new Like(UUID.randomUUID(), UUID.randomUUID());
        assertNotNull(like.getCreatedAt());
    }
}
