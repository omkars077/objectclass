package my_package;

public class NewObject {

    String brand="Dell";
    double price=62000.5;
    int ram=4;
    int harddrive=256;

    public static void main(String[] args){
        NewObject data= new NewObject();
        System.out.println(data.brand);
        System.out.println("Updated price of this laptop is : "+data.price+" rs ");
        System.out.println("This laptop has : "+data.ram+" gb ");
        System.out.println(data.harddrive);

        NewObject obj= new NewObject();
        System.out.println(obj.brand);
        System.out.println(obj.price);
        System.out.println(obj.ram);
        System.out.println(obj.harddrive);
    }
}
