// Creation of Array

// dataType arrayName[] = new dataType[size];

// int marks[] = new int[50];
// int numbers[] =  {1, 2, 3};
// int moreNumbersp[] = {4,5, 6};

// import java.util.*;

// public class array1 {
//     public static void main(String args[]){
//         int marks[] = new int[50];
//         System.out.println(marks);

//         String fruits[] = {"apple","bannana","Orange"};
//         System.out.println(fruits);
//    } 
// }

// string asel bydefault value is null
// number asel tar 0  

// *************************************************************************

//HOW TO TAKE INPUT OUT OF AN ARRAY

// public class array1 {
//     public static void main(String args[]){
//       int marks[] = new int[30] ;

//       Scanner sc = new Scanner(System.in);
//     //   int phy;
//     //   phy = sc.nextInt();

//     System.out.println("length of array: " + marks.length);

//     // marks[0] = sc.nextInt();
//     // marks[1] = sc.nextInt(); //physics
//     // marks[2] = sc.nextInt(); //chemistry
//     // marks[3] = sc.nextInt(); //math 
     
//     // // marks[2] = 100;
//     // System.out.println("Physics :" + marks[1]);
//     // System.out.println("Cheistry :" + marks[2]);
//     // System.out.println("Math :" + marks[3]);

//     // int percentage = (marks[1] + marks[2] + marks[3]) /3; 
//     // System.out.println("percentage : "  + percentage + "%");

//    } 
// }

// ***************************************************************************************************************

// PASSING ARRAYS AS ARGUMENT
//  > PASS BY VALUe MAin (Function madhe jae pan change zle te main function madhe reflect nahi karat)
//  > PASS BY REFRENCE (array)

// public class array1 {

//     public static void update(int marks[],int nonChangble){
//         for(int i = 0; i<marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }
//     }

//     public static void main(String[]args){
//         int marks[] = {97, 98, 99};
//         int nonChangble = 5;
//         update(marks , nonChangble); //call by refrence ne update kel;
//         System.out.println(nonChangble);
//         //print our marks
//         for(int i=0; i<marks.length; i++){
//             System.out.println(marks[i]+"");
//         }
//         // System.out.println();
//     }
// } 

// **************************************************************************

//LINEAR SEARCH 
// Find the index of elements in a given array  

// public class array1 {

//     public static int linearSearch(int numbers[], int key){

//         for(int i = 0; i<numbers.length; i++){
//             if(numbers[i] == key) {
//                return i;
//             }
//         }
//             return -1;
//     }

//     public static void main(String[]args){
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14};
//         int key = 0;
//         int index = linearSearch( numbers, key);  
//         if(index == -1){
//             System.out.println("not found");
//         }else{
//             System.out.println("Founded");
//         }
//     }
// }

//  Largest Number in array

// public class array1 {

//     public static int getLargest(int numbers[]){    
//         int largest = Integer.MIN_VALUE; //-infinity

//         for(int i=0; i<numbers.length; i++){
//             if(largest < numbers[i]){
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }
//      public static void main(String args[]){
//         int numbers[] = {1,2,3,4,5};
//         System.out.println("largest value : " +getLargest(numbers) );
//      }
// }

// public class array1 {

//     public static int getLargest(int numbers[]){    
//         int largest = Integer.MAX_VALUE; //-infinity

//         for(int i=0; i<numbers.length; i++){
//             if(largest > numbers[i]){
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }
//      public static void main(String args[]){
//         int numbers[] = {1,2,3,4,5};
//         System.out.println("largest value : " +getLargest(numbers) );
//      }
// }



// 

public class array1 {

    public static void main(String[] args){
        
        int choice = 3;

        switch(choice)
        {
            case 1 : System.out.println("in case-1");
            case 2 : 
        }
    }
    
}
