import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.abs;

public class Test {
    public static void main(String[] args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] str = sc.readLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visit = new boolean[100001];
        int second1 = 0;
        int max = 100000;
        Integer abc = x;
        while(true) {
            if(!queue.isEmpty()) {
                int[] z = queue.poll();
                abc = z[0];
                second1= z[1];
            }
            int a = abc+1;
            int b = abc-1>=0 ?abc-1 :0;
            int c = abc*2;
            if(abc.equals(y)) {
                System.out.println(second1);
                break;
            }
            second1 = second1+1;

            if(max>=a&&!visit[a]) {
                int[] graph = new int[2];
                visit[a] = true;
                graph[0] = a;
                graph[1] = second1;
                queue.add(graph);
            }
            if(max>=0 &&!visit[b]) {
                int[] graph = new int[2];
                visit[b] = true;
                graph[0] = b;
                graph[1] = second1;
                queue.add(graph);
            }
            if(max>=c &&!visit[c]) {
                visit[c] = true;
                int[] graph = new int[2];
                graph[0] = c;
                graph[1] = second1;
                queue.add(graph);
            }
        }
    }
}
