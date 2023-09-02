import java.util.UUID;

public class Hashtag {
    private final UUID id;
    private String name;

    public Hashtag(String name) {
        if (name.isEmpty() || name.contains("#")) {
            throw new IllegalArgumentException("El nombre del hashtag debe ser válido y no contener el símbolo '#'.");
        }
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return this.id;
    }

    // Otros métodos y lógica de negocio aquí
}