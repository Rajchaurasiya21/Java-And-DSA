class node {
    int val;
    node next; // null
    node(int val) {
        this.val = val; // --> Constructor.
    }
}
public class display {
    static void Display(node head) {
        // 10(head)->20->30->40->50(tail)
//        node temp = head;
//        while (temp != null) {
//            System.out.print(temp.val + " ");
//            temp = temp.next; // Important temp starts with head which is alrd 10 and if we do next it will go forward.
//
//            System.out.println();
//        }
// it can be done in for loop tho.
        for (node temp = head; temp != null; temp = temp.next) {
            System.out.println(temp.val);
        }
    }

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
            Display(a);

    }

}
