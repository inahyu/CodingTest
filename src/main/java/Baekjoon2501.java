import java.util.Scanner;

public class Baekjoon2501 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0) count++;

            if (count == k){
                System.out.println(i);
                break;
            }
        }
        if (count < k) System.out.println(0);



        sc.close();
    }
}
