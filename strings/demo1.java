package strings;
class Mobile{
    static String name;
    int price;
     String brand;

     public Mobile(){
        brand = " ";
        price = 20000;
        System.out.println("in constructor.");
     }
     static{
        name = "phone";
        System.out.println("in static block.");

     }

    public void show(){
        System.out.println(brand + " : "+price+" : "+name+".");
    }
}
public class demo1 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile");

           // Mobile obj = new Mobile();
           // obj.brand = "Apple";
            //obj.price = 50000;
           // Mobile.name="SmartPhone";

       // Mobile obj1 = new Mobile();
      //     obj1.brand= "Samsung";
       // obj1.price=25000;
       //     Mobile.name="SmartPhone";


        //Mobile.name="phone";
        //obj.show();
        //obj1.show();*

    }
}
