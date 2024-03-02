import java.util.*;
import java.util.Scanner;
class j2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);git 
        int SIZE = 3; // Define the size of arrays
        int[] a = new int[SIZE];
        int[] b = new int[SIZE];

        // Input elements for array a
        for (int i = 0; i < SIZE; i++) {
            a[i] = sc.nextInt();
        }

        // Input elements for array b
        for (int i = 0; i < SIZE; i++) {
            b[i] = sc.nextInt();
        }

        int ascore = 0, bscore = 0;

        // Comparing elements of arrays and updating scores
        for (int i = 0; i < SIZE; i++)
        {
            if (a[i] > b[i]) 
            {
                ascore++;
            } 
            else if (a[i] < b[i]) 
            {
                bscore++;
            }
        }

        // Printing scores
        System.out.println(ascore + " " + bscore);
    }
}
