import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * A grass tile has no interesting things about it.
 */
public class GrassTile extends Tile {

    double movementSpeed;
    static Image texture;

    public GrassTile(int posX, int posY) {
        super(posX, posY, Color.GREEN);
        this.movementSpeed = 5;
        this.isInteractiveTile = true;
    }

    public void setTexture(Image image){
        texture = image;
        this.isTextured = true;
    }
}
