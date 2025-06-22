package Opps.inheritance.Constructor;

public class Demo {

    Demo(int a){
         System.out.println(10);
    }
    Demo(){
        System.out.println(20);
    }

    public static void main(String[] args) {

        System.out.println("Start");
        
        Demo d1 = new Demo(11);
        System.out.println(d1);
        new Demo();
        // System.out.println(d2);
        
        System.out.println("End");
    }

}
