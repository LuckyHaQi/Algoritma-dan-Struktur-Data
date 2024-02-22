public class DragonMain16{
    public static void main(String[] args) {
        Dragon16 dg16 = new Dragon16(6, 5, 10, 10);
    
        dg16.printPosition();
        dg16.moveRight();
        dg16.printPosition();
        dg16.moveLeft();
        dg16.printPosition();
        dg16.moveUp();
        dg16.printPosition();
        dg16.moveDown();
        dg16.printPosition();
    }
}