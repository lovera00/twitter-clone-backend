import java.util.UUID;

public class Profile {
    private final UUID id;
    private String username;
    private String fullName;

    public Profile(String username, String fullName) {
        if (username.length() < 3) {
            throw new IllegalArgumentException("El nombre de usuario debe tener al menos 3 caracteres.");
        }
        if (username.length() > 10) {
            throw new IllegalArgumentException("El nombre de usuario no puede tener mas de 10 caracteres");
        }

        this.id = UUID.randomUUID();
        this.username = username;
        this.fullName = fullName;
    }

    public void updateFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }
}
