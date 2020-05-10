import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * Stone is a solid tile that you cannot move past.
 */
public class StoneTile extends Tile{
    double movementSpeed;
    static Image texture;

    public StoneTile(int posX, int posY) {
        super(posX, posY, Color.GRAY);
        this.movementSpeed = 5;
        this.isInteractiveTile = true;
        super.isSolid = true;
    }

    public void setTexture(Image image){
        texture = image;
        this.isTextured = true;
    }
}