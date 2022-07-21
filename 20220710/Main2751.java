<<<<<<< HEAD

public class Main2751 {

    public static void main(String[] args) {
        System.out.println("HEllo");
    }
}
=======
package baekjoon.b20220710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int value : list) {
            sb.append(value).append('\n');
        }

        System.out.println(sb);

    }
}
>>>>>>> 0c8d129fe452275e6e32d4604992b0e2f9f7032c
