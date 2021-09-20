package my_package;

public class NewObject {

    String brand;
    int ram;
    int battery;
    double price;

    public NewObject(String brand, int ram, int battery, double price) {
        this.brand = brand;
        this.ram = ram;
        this.battery = battery;
        this.price = price;
    }
    public static void main(String[] args){
        NewObject obj= new NewObject("Redmi",4,5000,8000);
        System.out.println(obj.brand);
        System.out.println(obj.battery);
        System.out.println(obj.price);
        System.out.println(obj.ram);

        NewObject obj1= new NewObject("Samsung",2,2500,12000.5);
        System.out.println("This mobile name is : "+obj.brand+" and price is "+" : "+obj.price+" rs ");
        System.out.println(obj.ram);
        System.out.println("This mobile battery is : "+obj.battery+"mah");
    }
}
