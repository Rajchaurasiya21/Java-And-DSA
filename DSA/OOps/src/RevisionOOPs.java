public class RevisionOOPs {
    static class Pokemon{
        int power;
        int attack;
        int defense;
        String type;
        String name;
        Pokemon(String t,int p){
            this.power=p;
            this.type=t;
        }
    }


    static void main() {
        Pokemon Pikachu= new Pokemon("electric",80);
        Pokemon Jigglypuff= new Pokemon("fairyType",50);
        final int x=25; // fix;
//        p1.name="Pikachu"; p1.type="Electric"; p1.attack=80;
//        Pokemon p2= new Pokemon();
//        p2.name="Charizard"; p2.type="fire"; p2.attack=120;
//        Pokemon p3= p1; // shallow copy of p1 ( can control p1)
//        p3.type="water";
//        System.out.println(p1.type);


    }
}
