package lab8_oo2;

public class Ball {
    // Public fields for position and size
    public int x, y, w, h;
    // Private fields for direction
    private int dirX, dirY;

    // Static fields for world dimensions
    public static int worldW, worldH;

    // Constructor with all parameters
    public Ball(int x, int y, int w, int h, int dirX, int dirY) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dirX = dirX;
        this.dirY = dirY;
    }

    // Constructor with default direction (1,1) using constructor chaining
    public Ball(int x, int y, int w, int h) {
        this(x, y, w, h, 1, 1);
    }

    // Move the ball and bounce off walls
    public void move() {
        x += dirX;
        y += dirY;

        // Bounce off left and right walls
        if (x < 0) { x = 0; dirX = -dirX; }
        if (x > worldW - w) { x = worldW - w; dirX = -dirX; }

        // Bounce off top and bottom walls
        if (y < 0) { y = 0; dirY = -dirY; }
        if (y > worldH - h) { y = worldH - h; dirY = -dirY; }
    }

    // Static method to set world dimensions
    public static void setWorld(int w, int h) {
        worldW = w;
        worldH = h;
    }
}
