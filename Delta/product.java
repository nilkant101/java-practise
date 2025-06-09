// public class product {
//     public static int products(int a, int b){
//         int products = a * b ;
//         return products;
//     }

//     public static void main(String args[]){
//         int a = 3;
//         int b = 15;
//         int p = a * b ;
//         // int p = products(a,b );
//         System.out.println(p);
//     }

// }


// Factorial.........;


public class product {
    public static int multiply(int a, int b){
        int products = a * b ;
        return products;
    }

  public static int factorial(int n){
    int f = 1;

    for( int i = 1; i<=n; i++ ){

        f *= i;
    }
    System.out.print("Factorial of " + n + " is ");
    return f; //factorial of n;
  }



    public static void main(String args[]){
       
        System.out.println(factorial(5));
    }

}
