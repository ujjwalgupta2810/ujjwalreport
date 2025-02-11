package Matrix;
import java.util.*;
//spiral matrix
public class matrix5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int tne = n * m;
        int count = 0;

        while (count < tne) {
            // Left column
            for (int i = minr; i <= maxr && count < tne; i++) {
                System.out.print(arr[i][minc] + " ");
                count++;
            }
            minc++;

            // Bottom row
            for (int j = minc; j <= maxc && count < tne; j++) {
                System.out.print(arr[maxr][j] + " ");
                count++;
            }
            maxr--;

            // Right column
            for (int i = maxr; i >= minr && count < tne; i--) {
                System.out.print(arr[i][maxc] + " ");
                count++;
            }
            maxc--;

            // Top row
            for (int j = maxc; j >= minc && count < tne; j--) {
                System.out.print(arr[minr][j] + " ");
                count++;
            }
            minr++;
        }
        sc.close();
    }
}
