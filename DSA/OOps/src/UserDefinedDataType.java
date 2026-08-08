public class UserDefinedDataType {
    public static class Student{
        String Name;
        int RollNo;
        double Cgpa;
    }

    public static void main(String [] Args) {
        Student s= new Student();
        s.Name="raj";
        s.RollNo=24;
        s.Cgpa=7.86;

        Student s1= new Student();
        s1.Name="RANA";
        s1.RollNo=25;
        s1.Cgpa=7.76;

        Student s2= new Student();
        s2.Name="Hero";
        s2.RollNo=224;
        s2.Cgpa=7.84;

        System.out.println(s2.Name+" "+s2.RollNo+" "+s2.Cgpa);

    }
}
