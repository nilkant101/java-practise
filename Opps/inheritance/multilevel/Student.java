package Opps.inheritance.multilevel;

public class Student {
    public static void main(String[]args){
        Department d = new Department();

        System.out.println("University Name: "+d.universityName);
        System.out.println("collage Name: "+d.collageName);
        System.out.println("Department Name: "+d.departmentName);

        System.out.println("----------------------------------");

        d.conductExam();
        d.fest();
        d.providePlacements();
    }
}
