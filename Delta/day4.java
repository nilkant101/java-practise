// Product of 2 numbers

public class day4 {
    public static void main(String args[]){
        int a = 4;
        int b = 5;
        int prd = multiply(a, b);
        System.out.println("hi" + prd);
        prd = multiply(10, 20);
        System.out.println(prd);
        prd = multiply(50, 2);
        System.out.println(prd);

    }

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
}
