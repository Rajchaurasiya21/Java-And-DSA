class Students {
    String name;
    private int RollNo;
    double Cgpa;
int getRollNo(){
    return RollNo;      // getter
}
void SetRollNo(int x){
    RollNo=x;       // setter
}
}
public class PrivateKeyboard {

    static void main() {
        Students s1= new Students();
       // error s1.RollNo=55645; // Immutable once it is declared we can't change for further as well.
        s1.Cgpa=5.25;
        s1.SetRollNo(45); // used for
        System.out.println(s1.getRollNo());
    }
}




























