package Game.testing;

public class Vector {
    public double x, y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector() {
    }

    public void add(Vector vector){
        this.x += vector.x;
        this.y += vector.y;
    }

    public void multiply(Vector vector1, Vector vector2){
        vector1.x *= vector2.x;
        vector1.y *= vector2.y;
    }

    public void multiply(Vector vector, int num){
        vector.x *= num;
        vector.y *= num;
    }

    public void normalize(){

        if (Math.abs(this.x) != 0) {
            this.x = this.x / Math.abs(this.x);
        }
        if (Math.abs(this.y) != 0) {
            this.y = this.y / Math.abs(this.y);
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}