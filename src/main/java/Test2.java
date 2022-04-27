import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Test2 {
    static boolean[][] visit;
    static Queue<Node> queue;
    static int width = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int caseCount  = Integer.parseInt(sc.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        while(caseCount>=1){
            width = Integer.parseInt(sc.readLine());

            visit = new boolean[width][width];
            queue = new LinkedList<>();
            String str ;
            str = sc.readLine();
            int x = Integer.parseInt(str.split(" ")[0]);
            int y = Integer.parseInt(str.split(" ")[1]);
            str = sc.readLine();
            int nowX = Integer.parseInt(str.split(" ")[0]);
            int nowY = Integer.parseInt(str.split(" ")[1]);
            int move = 0;
            while(true){
                if(!queue.isEmpty()) {
                    Node z = queue.poll();
                    nowX = z.x;
                    nowY = z.y;
                    move= z.move;
                }
                if(nowX == x && nowY ==y){
                    stringBuilder.append(move+"\n");
                    break;
                }
                move+=1;
                int xcase1 = nowX +2;
                int xcase2 = nowX +1;
                int xcase3 = nowX -2;
                int xcase4 = nowX -1;
                int ycase1 = nowY +2;
                int ycase2 = nowY +1;
                int ycase3 = nowY -2;
                int ycase4 = nowY -1;
                move(xcase1,ycase2,move);
                move(xcase1,ycase4,move);
                move(xcase3,ycase2,move);
                move(xcase3,ycase4,move);
                move(xcase2,ycase1,move);
                move(xcase2,ycase3,move);
                move(xcase4,ycase1,move);
                move(xcase4,ycase3,move);
            }
            caseCount--;
        }
        System.out.println(stringBuilder);
    }
    public static void move(int xcase, int ycase,int move){
        if(!(ycase<width&&xcase<width && xcase>=0 && ycase>=0))
            return;
        if(!visit[xcase][ycase]) {
            Node graph= new Node(xcase,ycase,move);
            visit[xcase][ycase] = true;
            queue.add(graph);
        }
    }
    static class Node{
        int x ;
        int y;
        int move;
        public Node(int x,int y, int move) {
            this.x= x;
            this.y= y;
            this.move=move;
        }
    }
}
