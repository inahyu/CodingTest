import java.util.Scanner;

public class BAEKJOON16953 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int cnt = 1;
        while (A != B){
            if(B < A){
                System.out.println(-1);
                System.exit(0);
            }

            if (B % 10 == 1) B /= 10;
            else if (B % 2 == 0) B /= 2;
            else {
                System.out.println(-1);
                System.exit(0);
            }

            cnt++;
        }

        System.out.println(cnt);

        sc.close();
    }
}
