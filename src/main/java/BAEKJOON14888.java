import java.util.Scanner;

public class BAEKJOON14888 {
    public static int N;
    public static int[] number;
    public static int[] operator = new int[4];
    public static int Max = Integer.MIN_VALUE;  // 최댓값
    public static int Min = Integer.MAX_VALUE;  // 최소값

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        number = new int[N];

        for (int i = 0; i < N; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++){
            operator[i] = sc.nextInt();
        }

        dfs(number[0], 1);

        System.out.println(Max);
        System.out.println(Min);

        sc.close();

    }

    public static void dfs(int num, int idx){
        if(idx == N){
            Max = Math.max(Max, num);
            Min = Math.min(Min, num);
            return;
        }

        for (int i = 0; i < 4; i++){
            if (operator[i] > 0){
                operator[i]--;
                switch (i){
                    case 0: dfs(num + number[idx], idx + 1);
                    break;
                    case 1: dfs(num - number[idx], idx + 1);
                    break;
                    case 2: dfs(num * number[idx], idx + 1);
                    break;
                    case 3: dfs(num / number[idx], idx + 1);
                    break;
                }
                operator[i]++;
            }
        }
    }

}
