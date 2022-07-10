import java.util.Scanner;

public class Main1292 {

    public static void main(String[] args) {
        
        int[] arr = new int[1000];
        int idx = 0;

        for(int i=1;i<=50;i++) {
            for(int j=1;j<=i;j++) {
                arr[idx] = i;        
                idx++;
            }

        }
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sumB, sumA =0;

        for(int i=0;i<b;i++) {
            sumB += arr[i] ;
        }
        for(int i=0;i<a-1;i++) {
            sumA += arr[i] ;
        }

        System.out.println(sumB-sumA);

    }

}