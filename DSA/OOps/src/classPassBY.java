
public class classPassBY {
   public static  class Car{
       int seats;
       String Name;
       double length;
       String Type;
       int torque;
       void print(){
           System.out.println(seats+" "+Name+" "+length+" "+torque+" "+Type); // call by print anywhere we can use it
       }

    }

    static void main() {
        Car c= new Car();
        c.length=4.55;
        c.Name="Kia ";
        c.seats=5;
        c.Type="SUV";
        c.torque=5;
        change(c); // pass by change variables.
        System.out.println(c.seats);
        c.print();
   }

    static void change(Car x) {
       x.seats=4; // trigger seats/.

    }
}
