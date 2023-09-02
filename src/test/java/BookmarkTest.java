import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.UUID;
import java.sql.Timestamp;

public class BookmarkTest {
    @Test
    public void testBookmarkShouldAssociateWithUserAndTweet() {
        UUID userId = UUID.randomUUID();
        UUID tweetId = UUID.randomUUID();
        Bookmark bookmark = new Bookmark(userId, tweetId);

        assertEquals(userId, bookmark.getUserId());
        assertEquals(tweetId, bookmark.getTweetId());
    }

    @Test
    public void testBookmarkShouldRegisterCreationDate() {
        Bookmark bookmark = new Bookmark(UUID.randomUUID(), UUID.randomUUID());
        assertNotNull(bookmark.getCreatedAt());
    }
}
