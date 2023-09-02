import java.util.UUID;

public class Profile {
    private final UUID id;
    private String username;
    private String fullName;

    public Profile(String username, String fullName) {
        if (username.length() < 3) {
            throw new IllegalArgumentException("El nombre de usuario debe tener al menos 3 caracteres.");
        }

        this.id = UUID.randomUUID();
        this.username = username;
        this.fullName = fullName;
    }
}
