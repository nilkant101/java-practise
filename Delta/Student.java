public class Student {
     
    String name;
    int marks;

    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.name+""+s1.marks);
        s2.marks = 20;
        System.out.println(s2.name+""+s2.marks);
    }

}
