// Methods

// public class fcn {

//     void display()
//     {
//         System.out.println("hello");
//     }

//     public static void main(String[] args) {
//         System.out.println("start");
        
//         fcn d = new fcn();

//         d.display();
//         //ObjNmae.classNmae(); to ns method syantax ;
//         System.out.println("end");

//     }
// }







// method with argument 

// public class fcn {

//     void add(int a, int b){
//        System.out.println(a + b);
//     }
//     public static void main(String[] args) {
        
//         fcn a = new fcn();wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
//         a.add(20, 20);
//     }
// }



// public class fcn{
//    public static void add(int a, int b){
//     System.out.println(a + b);

//   }
//   public static void main(String []args){
//     add(20,10);
//     // fcn additin = new fcn();
//     // additin.add(20,30);
//   }
// }

// public class fcn{

//   int add(int a, int b){
//     return a + b;
//   }
//   public static void main (String []args){

//     fcn obj = new fcn();
//     int addition = obj.add(20,30);
//     System.out.println(addition);
//   }
// };


// Method Overloading
// multiple fcn with same name their some have difference in archetecherre / difference in Argument


// 1. There should be change in the No of Arguments
// 2. There should be change in Datatype of the Argument
// 3.-------in the order/sequence of the datatype



// NOTE 
// 1. we can OVerload static and non static method also

// 2.CAN WE OVERLOAD MAIN METHOD
// > YESSSSSSS BUT THE Executiion starts from the main() with accept STRING ARRAY as an argument(STRING[]arr)

// 3. returntype might be same or defferent (is doesnt matter but you have to store it print it )
// 4. Method OVerloading is also reffered as complie time Polymorphism

// ***********************************************************************************

// public class fcn {
    // void m1( int x ,String y ){
    //  System.out.println(x + y ) ;
    // }
    // void m1( String x,int y ){
    //     System.out.println(x + y ) ;
    // }
    // void m1( double x){
    //     System.out.println(x);
    // }
    // void m1( int x){
    //     System.out.println(x);
    // }

    // public static void main(String[]args){
    //     fcn mo = new fcn();
    //     mo.m1(45);
        
    // }

// }

// *******************************************************************************************************
//MAIN MEHOD OVERLOADING BUT EXECUTION START WITH ALWAYS STRING ARRAY AS AN ARGUMENT

    // public class fcn {  
    //     public static void main(String[]args){
    //         System.out.println("hello");
    //         main(10);
    //         main(10.12);
    //         System.out.println("end");
    //     }      
    //     public static void main(int a){
    //         System.out.println("a:"+a);
    //     }
    //     public static void main(double a){
    //         System.out.println("a:"+ a);
    //     }
    // }

//******************************************************* */

// import java.util.Scanner;

// public class fcn {

//  public static void main(String[] args) {
   
//     System.err.println("start");
//     Scanner scan = new Scanner(System.in);
//     System.out.println("Enter the valur of a : ");
//     int a = scan.nextInt();
//     System.out.println("Enter the valur of a : "+ a);
    
//     System.out.println("Enter the valur of b : ");
//     String name = scan.next();
//     System.out.println("Enter the valur of a : "+ name);
//     System.out.println("end");
//     scan.close();
//  }  
// }

// ******************************************************

// import java.util.Scanner;

// public class fcn {

//     void add(int a, int b){
//         System.out.println("sum of "+ a + " and " + b+ " is : " + ( a + b));
//     }
//     public static void main(String[] args) {
        
//         Scanner scn = new Scanner(System.in);

//         fcn addition = new fcn();

//         System.out.println("enter number");
//         int a = scn.nextInt();
//         System.out.println("enter number");
//         int b = scn.nextInt();
//         addition.add(a,b);
//         // Scanner.close();
//     }
// }

// ********************************************

// import java.util.Scanner;

// public class fcn {
//     void num(int a){
//         if( a % 2 == 0 ){
//             System.out.println("even");}
//         else
//             System.out.println("odd");
//     }
//     public static void main(String[] args) { 
//        Scanner scn = new Scanner(System.in);
//         fcn number = new fcn();
//         int b = scn.nextInt();
//         number.num(b);
//     }
// }

// 1111111111111111111111111111111111111111111111111111111111111111111111111111


// Static Program


// public class fcn {
//     static int age = 20;

//     static void study(){
//         System.out.println("student is studing over her");
//     }

//     public static void main(String[] args) {
//         System.out.println("start");
//         // System.out.println(null);
//     }

// program 2========================

// public class fcn {
//      static int id = 101;
//      static void work(){
//         System.out.println("Employee is Working");
//      }
// }

//  public class fcn {

//       static int cost = 10;

//       public static void main(String[]args){
//         System.out.println(cost);
//         fcn.cost = 20; //we will directly also acces cost = 20;//due to its in same class 
//         System.out.println(cost);
//       }
    
//     }
