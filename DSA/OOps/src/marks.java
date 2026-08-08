public class marks {
    static class StudentsData {
        int RollNo;
        String name;
        int[] marks;
        int size;
        StudentsData(int s){
            marks=new int[s];


        }
    }  // this

    public static void main(String[] args) {
        StudentsData s1 = new StudentsData(5);
        StudentsData s2 = new StudentsData(5);
        s1.marks[0]=89;
        s1.marks[1]=66;
        s1.marks[2]=54;
        s1.marks[3]=55;
//        System.out.println(s1.marks[0]);
        for(int i=0;i<s1.marks.length;i++){
            System.out.println(s1.marks[i]);
        }




    }
}