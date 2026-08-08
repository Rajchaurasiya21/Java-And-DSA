class Cricketer{
    final String Country=" India";
    int runs;
    double avg;
    String name;
}
public class FinalAndStatic {
    static void main() {
        Cricketer c1 = new Cricketer();
//        c1.Country = "pakistan"; cant use it again bcz of final keyboard.
    }

}
