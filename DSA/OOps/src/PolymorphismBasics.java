public class PolymorphismBasics {
   // Poly:  many morphism:forms-many forms. one name and multiple name.
    public static class dog {
        void speak(){
            System.out.println("Bhau bhau barking");
        }
    }
    public static class lion{
        void speak(){
            System.out.println("garrrrrrrr");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("meow ");
        }

    }
   static void main() {
        dog n= new dog();
        Cat c= new Cat();
        lion x= new lion();
       n.speak(); // calling by class.
       c.speak();
       x.speak();

   }
}
