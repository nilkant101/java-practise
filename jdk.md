# JDK --
🌿 is software its contain all the sources to devlop a java program execute a java progarm 

# Jre
🌿 its provide platform only for the execution of program
    - devlopment tools and libraries

1. JIT - just in time compiler (HLL ----> MLL)
2. Class Loader - the classs loader is loaad the class 2ndray Storage(hrd drive our pc to) to executable area 
3. Interpreater --> interprets the code line by line
4. JVM --> java vertual machine
   JVM -> is the manager of the JRE.


  # JVM Archetechure
     
     1. Heap Area - Object get Created
     2. Class area or Static pool - All static members gets stored here.
     3. Stack - Execution happens inside stack 
     4. Method Area - Implementation of method is stored here
     5. Naticve area 

* ----------------------------------------------------------------

# CONSTRUCTOR

1. Initilzation (set of instruct)
   instantiation (objection creation phase is     instatiation)

2. ClassName & COnstructor Name --> Same
3. never returntype  
4. execute --> Object creation chya veli execute hote

SYNTAX : AccessSpecifier ClassName(){
            -----------
          } 

  // Non-Parameterized Custom Constructor   
 #         class Car {
            
            Car(){
                system.out.println("heuu")
            }
            
            public static void main (String[] args){
                s.o.p('Start')

                Car c = new Car();
                             ⬇
                        Consructor cell
              s.o.p('End')
            }
#         }
  
  //juar constructor nasel tar compiler is atomatically cal the constrctor

  Public class pen {

    pen(){
        // implicitly presnt --> Default COnstructor
    } 

    Public Static void main(String[]args){
        pen p = new Pen();
    }
  }

  1. constructor is a set of instruction used for initilization (Assigning) and Instantiation(Object Creation)
 
 5. Constructors are categorized into 2 types
        a. Default constructor
        a. Custom/User-Defined constructor

 # a. Default constructor
 ---------------------------
    1. if a constructor is not explicitly present in a class, than the compailer will atomatically generate a constructor and those constructors are called as default constructor

    2. Default constructor neither accepts any arguments nor has any implementation.

 # b. Custom/User-Defind Constructor
    ---------------------------------
*   1. If a constructor is explicitly defind inside a class by the user or the programmer, 
       then we refer it as custom/ user-defined constructor.

*    2. They are futheer categorized into 2types
        i. NON PARAMETERIZED Custom Constructor
        ii. Parameterized Custom Constructor
 
 i.  Public class pen {

    pen(){
        System.out.println("i am non parameterized custom constructor");
    } 
    Public Static void main(String[]args){
        pen p = new Pen();
    }
  }

 
 ii.  Public class pen {

    pen(int cost){
        System.out.println("Cost: "+cost);
    } 
    Public Static void main(String[]args){
        pen p = new Pen(100);
    }
  }

=======================================================================

# GlObal/ member variable & Local Variable

Class A {
    int x = 10;  -----> Global/ Member variable (it's a STATIC or NON STATIC)

    void m1 (int y){   ______>
        int z;        ---->  Y and Z both are local Variable
    }
}
---------------------------------------------------------------
1. Global/ Member variables are those variables which are declared in the class limit/Scope

2. They can be accessed globally ie. through out the class

3. Global/Member variables are categorized into
         a. Static
         b. Non-static
--------------------------------------------------------
1. Local variabels are those variables which are delared within a specific      scope or limit such as method, constructor etc.....
2. Local variables are accessible within that specific scope
----------------------------------------------------------------

# This Keyword

1. In java, we can have both member/ global and local variable names same, then always the local variables will dominate the member variables
* -- In order to avoid the dominating part we make use pf "this"Keyword

2. THIS keyword which is used to pointing to the current object/ instance..

