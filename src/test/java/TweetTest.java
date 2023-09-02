import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.UUID;

public class TweetTest {

    @Test
    public void testTweetShouldHaveValidContent() {
        String tweetWithTooMuchCharacter = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        assertThrows(IllegalArgumentException.class, () -> new Tweet("", UUID.randomUUID()));
        assertThrows(IllegalArgumentException.class, () -> new Tweet(tweetWithTooMuchCharacter, UUID.randomUUID()));
    }

    @Test
    public void testTweetShouldGenerateUniqueId() {
        Tweet tweet1 = new Tweet("Hello, world!", UUID.randomUUID());
        Tweet tweet2 = new Tweet("Another tweet!", UUID.randomUUID());
        assertNotEquals(tweet1.getId(), tweet2.getId());
    }

    @Test
    public void testTweetShouldRegisterCreationAndUpdateDate() {
        Tweet tweet = new Tweet("Hello, world!", UUID.randomUUID());
        assertNotNull(tweet.getCreatedAt());
        assertNotNull(tweet.getUpdatedAt());
        assertEquals(tweet.getCreatedAt(), tweet.getUpdatedAt());
    }
}
