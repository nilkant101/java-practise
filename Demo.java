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

public class Demo {

    static int p = 10;
    static{  
        p = 20;
    }
    public static void main(String[] args) {
    //     Demo q = new Demo();
    //    int demoo = q.p;
    //     System.out.println(demoo);
        System.out.println(Demo.p);
    }
    static {
         p = 10;
    }
    //  {
    //    int p = 30;
    // }
}

