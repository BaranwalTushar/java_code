import java.util.Scanner;
public class geeksfgeeks_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][] arr2d = new int[0][0];
        int [] arr1d = new int[0];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                arr2d[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            arr1d[i] = sc.nextInt();
        }

        int sum =0;
        for(int i=0;i<n;i++){

            sum += arr2d[i][i];
        }
          int max = arr1d[0];
        for (int i = 1; i < n; i++) {
            if (arr1d[i] > max) {
                max = arr1d[i];
            }
        }

        System.out.println(sum +" " +max);

    }
    
}
