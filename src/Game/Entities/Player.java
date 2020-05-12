package Game.Entities;

import Game.Chunk;
import Game.Main;
import Game.Tiles.Tile;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.util.HashSet;

public class Player extends Entity {

    Tile[][] visibleTiles = new Tile[10][10];
    private static int speed = 5;

    private static HashSet<String> currentlyActiveKeys = new HashSet<String>(1);
    private boolean hasChangedFullscreen;



    public Player(Color backColor, javafx.scene.shape.Rectangle boundsBox) {
        super(backColor, boundsBox);
    }

    public Player(Image texture, javafx.scene.shape.Rectangle boundsBox) {
        super(texture, boundsBox);
    }

    @Override
    public void tick() {
        super.tick();


        if (currentlyActiveKeys.contains("A")) {
            this.xSpeed = speed * -1;
            this.posX += this.xSpeed;
            this.tileX = (int)this.posX / Tile.getWidth();
        }

        if (currentlyActiveKeys.contains("D")) {
            this.xSpeed = speed;
            this.posX += this.xSpeed;
            this.tileX = (int)this.posX / Tile.getWidth();
        }

        if (currentlyActiveKeys.contains("W")) {
            this.ySpeed = speed * -1;
            this.posY += this.ySpeed;
            this.tileY = (int)this.posY / Tile.getWidth();
        }

        if (currentlyActiveKeys.contains("S")) {
            this.ySpeed = speed;
            this.posY += this.ySpeed;
            this.tileY = (int)this.posY / Tile.getWidth();
        }
        // Binding for going in and out of fullscreen
        if(currentlyActiveKeys.contains("F11")) {
            if (!hasChangedFullscreen) {
                Main.switchFullscreen();
            }
            hasChangedFullscreen = true;
        }

    }

    // Sets the variable that checks if the fullscreen has been changed
    public void setHasChangedFullscreen(boolean hasChangedFullscreen) {
        this.hasChangedFullscreen = hasChangedFullscreen;
    }

    public Chunk[] getSurroundingChunks(){

        Chunk[] surroundingChunks = new Chunk[9];

        return surroundingChunks;
    }

    public static HashSet<String> getCurrentlyActiveKeys() {
        return currentlyActiveKeys;
    }
}