import java.util.UUID;

public class Reply {
    private final UUID id;
    private String content;
    private final UUID userId;
    private final UUID tweetId;

    public Reply(String content, UUID userId, UUID tweetId) {
        if (content.isEmpty() || content.length() > 140) {
            throw new IllegalArgumentException("El contenido de la respuesta debe tener entre 1 y 140 caracteres.");
        }
        this.id = UUID.randomUUID();
        this.content = content;
        this.userId = userId;
        this.tweetId = tweetId;
    }

    public void updateContent(String newContent) {
        if (newContent.isEmpty() || newContent.length() > 140) {
            throw new IllegalArgumentException("El nuevo contenido de la respuesta debe tener entre 1 y 140 caracteres.");
        }
        this.content = newContent;
    }

    public boolean delete() {
        // Aquí podría ir la lógica para eliminar la respuesta, si es necesario.
        // Por ahora, simplemente devolvemos true para indicar que la operación fue exitosa.
        return true;
    }

    public String getContent() {
        return this.content;
    }

    // Otros métodos y lógica de negocio aquí
}
