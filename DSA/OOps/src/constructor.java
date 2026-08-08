public class constructor {
    static  class Car{
        int seats;
        String name;
        double length;
//        Car(){
//                  we aren't able to write anything in default constructor
//        }
        Car(int x,String s,double d){
            seats=x;
            name=s;
            length=d;

        }
        void print(){
            System.out.println(seats+" "+name+" " +length);
        }
    }

    public static void main(String[] args ) {
        Car c1= new Car(5,"Kia",2.55);
        c1.print();
        Car c2= new Car(2,"honda bike",1.55);
          c2.print();

    }
}
