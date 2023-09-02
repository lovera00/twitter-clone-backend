import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.UUID;

public class HashtagTest {

    @Test
    public void testHashtagShouldHaveValidName() {
        assertThrows(IllegalArgumentException.class, () -> new Hashtag(""));
        assertThrows(IllegalArgumentException.class, () -> new Hashtag("#invalidName"));
    }

    @Test
    public void testHashtagShouldBeAddedToTweet() {
        Tweet tweet = new Tweet("Hello, world!", UUID.randomUUID());
        Hashtag hashtag = new Hashtag("hello");
        tweet.addHashtag(hashtag);
        assertTrue(tweet.getHashtags().contains(hashtag));
    }
}