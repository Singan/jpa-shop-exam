import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(sc.readLine());
        int line = 0;

        int[][] answer = new int[height][];
        while (height > line) {

            String str[] = sc.readLine().split(" ");
            answer[line] = new int[line + 1];
            for (int i = 0; i < str.length; i++) {
                int number = Integer.parseInt(str[i]);
                int a = 0;
                if (line != 0) {
                    int prevNumber = i == 0 ? answer[line - 1][i] : answer[line - 1][i - 1];
                    int nextNumber = i == str.length - 1 ? answer[line - 1][i - 1] : answer[line - 1][i];
                    a = prevNumber >= nextNumber ? prevNumber : nextNumber;
                }
                answer[line][i] = number + a;
            }
            line++;
        }
        int max = 0;
        for (int i = 0; i < answer[height - 1].length; i++) {
            max = max < answer[height - 1][i] ? answer[height - 1][i] : max;
        }
        System.out.println(max);
        sc.close();
    }
}
