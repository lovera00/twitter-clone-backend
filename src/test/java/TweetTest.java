import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

public class TweetTest {

    String tweetWithTooMuchCharacter = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    @Test
    public void testTweetShouldHaveValidContent() {
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

    @Test
    public void testTweetShouldUpdateContentWithValidData() {
        Tweet tweet = new Tweet("Hello, world!", UUID.randomUUID());
        tweet.updateContent("Updated content");
        assertEquals("Updated content", tweet.getContent());
    }

    @Test
    public void testTweetShouldNotUpdateContentWithInvalidData() {
        Tweet tweet = new Tweet("Hello, world!", UUID.randomUUID());
        assertThrows(IllegalArgumentException.class, () -> tweet.updateContent(""));
        assertThrows(IllegalArgumentException.class, () -> tweet.updateContent(tweetWithTooMuchCharacter));
    }
}
