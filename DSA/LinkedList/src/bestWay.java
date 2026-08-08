// class node {
//    int val;
//    node next; // null
//    node(int val) {
//        this.val = val; // --> Constructor.
//    }
//}
public class bestWay {
        static void main() {
//        10->20->30->40->50
           node a = new node(10);
           node b=  new node(20);
           node c= new node(30);
           node d= new node(40);
           node  e= new node(50);
           a.next=b;
           b.next=c;
           c.next=d;
           d.next=e;

           System.out.println(a);
           System.out.println(b);
           System.out.println(a.next.next);
            System.out.println(a.next.val);
        }

}
