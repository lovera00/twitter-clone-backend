import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProfileTest {

    @Test
    public void testUsernameShouldHaveAtLeastThreeCharacters() {
        assertThrows(IllegalArgumentException.class, () -> new Profile("ab", "John Doe"));
    }
    @Test
    public void testUsernameShuldHaveLessTenCharacteres(){
        assertThrows(IllegalArgumentException.class, () -> new Profile("aaaaaaaaaaa", "John Doe"));
    }
}
