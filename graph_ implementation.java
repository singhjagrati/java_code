import java.util.Scanner;
 class graph { 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();     //5
         int[][] arr = new int[n][n];  //0,1,2,3,4,5
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.println("enter 1 to make edge else in between else 0");
                 int edge = sc.nextInt();
                 arr[i][j] = edge;
                 arr[j][i] = edge;

             }
         }
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }

     }
 }


