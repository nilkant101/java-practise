# Constructor Chaining
1. The process of one constuctor calling another constrctor is called as constructor chaining.
2. Constructor Chaining can be achieved only in case of constructor overloading.

3. Constructor Chaining can happen in two ways.

a. Constructor Chaining in same class can be achieved using this calling statement 
* ie. this();

b. Constructor Chaining in another class can be achieved using super calling statement 
* ie. super() & Is- s relationship ;


calss father {
    Father(int x)  
    {
        Sopln(1); 
    }
    <!-- ithe jar non paramterize fcun ast tar appn sirectly son ch obect banvl ani 2nd file madhe jari super call statement nhi write kel tari it will call fatehr constructor -->
}
2nd file

public class Son extends Father{
    Son(){
        super(10); 
        Sopln(2)
    }
}

test file

public class Test{

    public static void main(String[]args){
        Son s = new Son();
    }
}

1. super() 
*    is to invoke or call constructor of another class
  for that we have this a, b⬇️
   a. IS -A (Inheritance) --> extends.
   b. super() ie. super calling statement.

# its used in two way
1.
When we create a OBJECT for a class, and if that class has a super class, and if that super class has a non-parameterized constructor, then the sub class constructoe will invoke the super class constructor implicitly;

calss father {
    Father(){
        Sopln(1); 
    }
}

* 2nd file
public class Son extends Father{
    Son(){
        <!-- super();  --> Automatically call
        Sopln(2)
    }
}

* test file
public class Test{
    public static void main(String[]args){
        Son s = new Son();
    }
} <!-- OOut Put = 1, 2   -->

2. When we create an object of a class, and if that class has a super class, and if that super class has a parameterized constructor, then the sub class constructor should invoke the super class constructor explicitlym otherwise we get compile time error

calss father {
#    Father(int x){
        Sopln(1); 
    }
}

* 2nd file
public class Son extends Father{
    Son(){
<!-- #        super();  -->  auto not callerror we have to call if not +nt Super() statement we gave CTE
        super(10);  // we have to call
        Sopln(2)
    }
}

* test file
public class Test{
    public static void main(String[]args){
        Son s = new Son();
    }
} <!-- Out Put = CTE   -->


---------------------