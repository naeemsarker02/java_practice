// public class D{
//     public static void main(String[] args){
//         int[][] DDarr = { {1,2,3,4,5},
//                           {6,7,8} };
//         System.out.println(DDarr[1][2]);
//     }
// }



// Java Program to demonstrate the use of 
// Two Dimensional Array


// class D {
//     public static void main(String[] args){

//           // Array Intialised and Assigned
//         int[][] arr = { { 1, 2 }, { 3, 4 } };

//           // Printing the Array
//         for (int i = 0; i < 2; i++){
//             for (int j = 0; j < 2; j++)
//                 System.out.print(arr[i][j]+" ");
//               System.out.println();
//         }
//     }
// }

public class D{
    public static void main(String[] args){
        int [][] arr = { { 1, 2 }, 
                         { 3, 4 } };

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j] +" ");
                System.out.println();
            
        }
    }
}