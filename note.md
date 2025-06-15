# Methods
1. task
2. Syantax : AccessSpecifier returntype methodName(){
        return
   }
3. execute ===> call , invoke

   call ---> objName.methodName();


--> method without arguments, & without return statement
-->          with    -----      ------  ---     -----
-->        without   -----      with    
-->          with    -----      with       ---   -------

# method without arguments, & without return statement

public class fcn(
  
  void add(){
    System.out.println("hi");
  }
  public static void main(String[]args){
    add();
  }  
);

# method with arguments, & without return statement
public class fcn(

   void add(int a, int b){
    System.out.println(a + b);

  }
  public static void main(String []args){
    
    fcn additin = new fcn()
    addition.add(20,30);
  }
)

# method without arguments, & with return statement

  public class fcn(

    String add(){
      return "HI";
    }
   public static void main (String []args){
    add()
   }  
);

# methos with argument and with return statement

public class fcn{

  int add(int a, int b){
    return a + b;
  }
  public static void main (String []args){

    fcn obj = new fcn();
    int addition = obj.add(20,30);
    System.out.println(addition);
  }
};




# Method Overloading
multiple fcn with same name their some have difference in archetecherre / difference in Argument

 
1. There should be change in the No of Arguments
2. There should be change in Datatype of the   
    Argument
3. -------in the order/sequence of the datatype

# NOTE 
1. we can OVerload static and non static method also

2. CAN WE OVERLOAD MAIN METHOD
> YESSSSSSS BUT THE Executiion starts from the main() with accept STRING ARRAY as an argument(STRING[]arr)
3. returntype might be same or defferent (is doesnt matter but you have to store it print it )
4. Method OVerloading is also reffered as complie time Polymorphism

 #  public class fcn {  
        public static void main(String[]args){
            System.out.println("hello");
            main(10);
            main(10.12);
            System.out.println("end");
        }      
        public static void main(int a){
            System.out.println("a:"+a);
        }
        public static void main(double a){
            System.out.println("a:"+ a);
        }
    }




# Scanner =
    is pridefind class in java.util Package
    in ordr to accept input from user

    scanner is pridefin class present in util folder util folder predefine java folder 
     
 * rules to accept dynamic input from the user 
   Rule to work around with SCANNER class

   1. Crete an Object of Scanner class
   2. Pass System.in to the Constructor call.
     * syntax : Scanner scan = new Scanner(System.in);

   3. import Scanner class from java.util package.
     * syntax : import java. util.Scanner;

   4. Make use of pre-defind method to accept dynamic input.

   <!-- Important method used wrt Scanner class -->

#            STATIC 
         we will used in 
veriable , method , class , Block 
                      |
           <!-- innerClass is Static not outer (we wil see later) -->
class Student { <!--Class is a platform to store    state and behaviour of an Obj-->

static int age = 10 ;


}

1. static is a keyword which can be used with 
    [ class, veriable , method and blocks. ]

2. The class Loader loads all the static properties inside a memory 
   location called Class Static Area or Static Pool.

3. all the static properties access with the className.

4. static properties can be accessed directly or with the help of ClassName in the same class

5. static properties accessed only with the help of ClassName in the different/ another class.

6. we can reinitatalize also static veriables

    public class car {

      static int cost = 10;

      public static void main(Staring[]args){
        System.ot.println(cost);
        car.cost = 20; //we will directly also acces cost = 20;//due to its in same class 
        System.out.println(cost);
      }
    
    }

7. we acces the static properties with the help of obj creation but its not good practice..........  



syntax : ClassName.variableName or ClassName.methodName();

* Note

1. STATIC PROPERTIES ARE LOADED ONLY ONCE , THEREFORE THEY WILL HAVE A SINGLE COPY

2. ALL OBJ WILL IMPICITLY BE POINTING TO THE STATIC POOL, therefore 
   we can access static properties with object refrence but not a good practice

    


# BLOCKS ========================
        --- initialize set of instruction we use bllock
* BLocks --- initalize data members we use blocks

            Initialization 
            /         \
#        Static    Non Static (INSTANCE BLOCK)
                     /    \
#                Static  Non-static

  
# Execution always starts from main method but class loader loads all static properties first


# Static Block
BLOCKS ----static --> Static Veriable (Use for initalizong staic veriable)

  1. Static block are a set if instructions used to    initializing static veriable

  syntax :    static {}
-------------------
when it execute before main() madhod and CLASS LOADING TIME  
                ---------------------    --------------------
                 WHAT IF MULTIPLE STATIC  BLOCK THEN EXECUTE SEQUENCILLY
  

# non-Static Block

1. set of instruction initallize static veriable and non-static variables

syntax :  {}

2. it will always gets executed during object creation (Instantiation)
3. multiple ns block exection start in a se uential manner.


📍note - we can initialize static veriable in a non- static block its not a good practicce



