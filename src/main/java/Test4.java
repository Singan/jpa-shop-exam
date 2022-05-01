import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Test4 {
    static int selectNum = 0;

    public static void main(String[] args) throws Exception{

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(sc.readLine());
        int line = 0;
        int home [][] =new int[1000][1000];
        int answer[][] = new int[height][3];
        while (height > line) {
            String str[] = sc.readLine().split(" ");
            for (int i = 0; i < str.length; i++) {
                int number = Integer.parseInt(str[i]);
                home[line][i] = number;
            }
            line++;
        }

    }

}