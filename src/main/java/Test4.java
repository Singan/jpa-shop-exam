import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Test4 {
    public static void main(String[] args) throws Exception {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(sc.readLine());
        long [][] answer= new long [height][10];
        for(int i = 0;i<10;i++){
            answer[0][i] = 1;
        }
        for(int i = 1;i<height;i++){
            for(int j=0;j<10;j++){
                if(j>0 && j<9) {
                    answer[i][j] = (answer[i-1][j-1]+answer[i-1][j+1])%1000000000;
                }else if(j==0){
                    answer[i][j] = answer[i-1][j+1]%1000000000;
                }else if(j==9){
                    answer[i][j] = answer[i-1][j-1]%1000000000;
                }
            }
        }
        long count = 0;
        for(int i = 1;i<10;i++){
            count+=answer[height-1][i] ;
        }
        System.out.println(count%1000000000);
    }
}