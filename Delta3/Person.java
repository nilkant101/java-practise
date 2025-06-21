// package Delta3;
// public class Demo {
    
//     static int age ;
//     static{
//         System.out.println("in Static Block-1");
//     }
//     static{
//         System.out.println("in Static Block-2");
//     }
//     public static void main(String[] args) {
//         System.out.println("Hello");
//     }
//     static{
//         System.out.println("block-3 ");
//     }
// } 



// Question ask===================
// public class Demo {
//     static int age;
//     static{
//         System.out.println("Initializing age to 10");
//         age = 10;
//     } 
//     static{
//         System.out.println("Age: "+ Demo.age);
//     }
//     public static void main(String[] args) {
//         System.out.println("Hello");
//         Demo M = new Demo() ;
//         M.mainn();  
//         M.main();  
//     }
//     static{
//         System.out.println("Initializing age 20");
//         Demo.age = 20;
//     }
//     void mainn(){
//         System.out.println("Age: "+ Demo.age);
//     }
//      void main(){
//         System.out.println("Age:hi "+ Demo.age);
//         mainn();
//     }
// }  


// public class Demo {
//     static int age;
//     public static void main(){
//         System.out.println("Initializing age to 10");
//         age = 10;
//     } 
//     static{
//         System.out.println("Age: "+ Demo.age);
//     }
//     public static void main(String[] args) {
//         System.out.println("Hello");   
//         main();
//     }
//     static{
//         System.out.println("Initializing age 20");
//         Demo.age = 20;
//     }
//      static{
//         System.out.println("Age: "+ Demo.age);
//     }
// // }  


// COnstuctor

// public class Constructor {

//     static int p = 10;
//     static{  
//         p = 20;
//     }
//     public static void main(String[] args) {
//     //     Demo q = new Demo();
//     //    int demoo = q.p;
//     //     System.out.println(demoo);
//         System.out.println(Constructor.p);
//     }
//     static {
//          p = 10;
//      }
//     //  {
//     //    int p = 30;
//     // }
// }

// constructor student ==========================

// public class Constructor {

//     int age;

//     Constructor(int a){
//         age = a ;
//     }

//     public static void main(String[] args) {
        
//         Constructor c1 = new Constructor(10);
//         System.out.println(c1.age);
//     }
// }


// This keyword============================

// public class Person {
//     int age;
//     String name;

//     Person(int age, String name){
//         this.age = age;
//         this.name = name;
//     }
//     public static void main(String[] args) {
//         Person p1 = new Person(20,"NIl" );
//         System.out.println(p1);
//     }
// }

// in this case 1 object will create in this object having      address whi is point that object p1 
// * What is job of obj to store a non static propertes
 // int this case age --> 0  
//                name --> null  
//   the age of 20 will store in current obj  
// Which is current obj p1 age is intiallize 0 to 20
// same obj p1 name is intiallize null to NIL ;

public class Person {
     double height = 5.4;
     void display(){
        double height = 4.4;
        System.out.println(this.height);
        System.out.println(height);
     }
     public static void main(String[] args) {
         Person p = new Person();
         p.display();
     }
}