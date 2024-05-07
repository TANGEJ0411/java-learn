package inherit;

public class HybridCar extends Car{
    public boolean battery;
    public int runDistance;
    public String brand;
    public String hybridColor;
    public HybridCar(int runDistance){
        super(4, "hybrid", "Toyota", "white");
        this.battery = true;
        this.runDistance = runDistance;
        // 建構後可以透過super呼叫父類別的方法，呼叫getter
        this.brand = super.getBrand();
        // color 是protected，所以可以直接存取
        this.hybridColor = super.color;
    }
    // 因為brand是private，所以無法直接存取，若要存取，可以透過getter
    //多載 overloading：名稱相同，透過不同引數、型態，來呼叫相對應的函數。
    //改寫 overriding：於子類別中，定義與父類別均相同的函數（名稱相同，引數個數相同）。
    public void print(){
        System.out.println("子類別這是一台: " + this.tire + "輪的，" + this.engine + "引擎的" + this.brand + "車，可以跑" + this.runDistance + "公里");
    }
}
