import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main10773 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Stack<Integer> al = new Stack<>();
        int sum = 0;
        for (int i = 0; i < K; i++) {
            int a = Integer.parseInt(br.readLine());

            if (a == 0) {
                al.pop();
                continue;
            }

            al.push(a);

        }

        while (!al.isEmpty()) {
            sum += al.pop();
        }
        System.out.println(sum);
    }
}