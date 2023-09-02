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
    @Test
    public void testProfileShouldUpdateFullName() {
        Profile profile = new Profile("john123", "John Doe");
        profile.updateFullName("John M. Doe");
        assertEquals("John M. Doe", profile.getFullName());
    }
}
