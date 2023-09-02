import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProfileTest {

    @Test
    public void testUsernameShouldHaveAtLeastThreeCharacters() {
        assertThrows(IllegalArgumentException.class, () -> new Profile("ab", "John Doe"));
    }
}
