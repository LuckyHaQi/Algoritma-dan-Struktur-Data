public class Dragon16{
    int x, y, width, height;
    public Dragon16(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    void moveLeft() {
        x--;
        if (x < 0) {
            detectCollision();
        }
    } 
    
    void moveRight() {
        x++;
        if (x > width) {
            detectCollision();
        }
    }
    
    void moveUp() {
        y--;
        if (y < 0) {
            detectCollision();
        }
    }
    
    void moveDown() {
        y++;
        if (y > height) {
            detectCollision();
        }
    }
    
    void printPosition() {
        System.out.println("Letak Dragon: (" + x + ", " + y + ")");
        if (x >= width|| y >= height || x == 0 || y == 0) {
            detectCollision();
        }
    }
    
    void detectCollision() {
        System.out.println("Game Over!");
        System.exit(0);
    }
}
