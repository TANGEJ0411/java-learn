package inherit;

public class Car {
    public final int tire;
    public String engine;
    private String brand;
    protected String color;
    public Car (int tire, String engine, String brand, String color){
        this.tire = tire;
        this.engine = engine;
        this.brand = brand;
        this.color = color;
    }
    public void printCar(){
        System.out.println("這是一台: " + this.tire + "輪的，" + this.engine + "引擎的" + this.brand + "車");
    }
    // getter
    public String getBrand(){
        return this.brand;
    }
}
