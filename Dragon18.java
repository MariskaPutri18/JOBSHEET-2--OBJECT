public class Dragon18 {
    public static void main(String[] args) {
        Dragon dragon = new Dragon(0, 0, 3, 2);
        dragon.printPosition();
        dragon.moveRight();
        dragon.printPosition();
        dragon.moveDown();
        dragon.printPosition();
        dragon.moveLeft();
        dragon.printPosition();
        dragon.moveUp();
        dragon.printPosition();
    }
}
class Dragon{
    private int x;
    private int y;
    private int width;
    private int height;

    public Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        x--;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    public void moveRight() {
        x++;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    public void moveUp() {
        y--;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    public void moveDown() {
        y++;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    public void printPosition() {
        System.out.println("Position: (" + x + ", " + y + ")");
    }

    private void detectCollision() {
        System.out.println("Game Over");
    }
}
    

