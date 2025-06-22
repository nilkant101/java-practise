package Opps.inheritance.Constructor;

public class Employee {
        int id;
        String name;
        double salary;

        Employee(int id , String name, double salary){
            this.id = id;
            this.name = name;
            this.salary = salary;

        }

        public void display(){
             System.out.println("Employee name: "+ this.name);
             System.out.println("Employee id : "+ this.id);
             System.out.println("Employee salary : "+ this.salary );
        }
        public static void main(String[] args) {
            
            Employee e1 = new Employee(10,"Patil", 10000);
            Employee e2 = new Employee(11,"Wakle", 20000);
            e1.display();
            e2.display();
        }


    
    
}