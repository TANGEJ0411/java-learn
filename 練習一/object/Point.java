package object;

public class Point {
    // static 是類別屬性
    public static int ORIGIN_X = 0;
    public static int ORIGIN_Y = 0;
    // 沒有static 是物件屬性，3, 4是預設值，也可以不給預設值
    public int x;
    public int y;
    private int z;
    // 定義基礎物件的基礎建構式，需要跟類別名稱一模一樣
    public Point(int xPos, int yPos) {
         this.x = xPos;
         this.y = yPos;
         this.z = 0;
    }

    // 物件方法
    public void print() {
        // this會指向當前的物件實體
        System.out.println("x: " + this.x + ", y: " + this.y + ", z: " + this.z);
    }

    
}
