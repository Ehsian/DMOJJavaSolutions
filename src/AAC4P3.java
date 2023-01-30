import java.io.*;
import java.util.*;
public class AAC4P3 {
    public static void main(String[] args) throws IOException{ //TLE
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());
        int[][]coordinates = new int[N][2];
        for(int i=0;i<N;i++){
            tk = new StringTokenizer(br.readLine());
            coordinates[i][0]=Integer.parseInt(tk.nextToken());
            coordinates[i][1]=Integer.parseInt(tk.nextToken());
        }
        Double[]slopes = new Double[M];
        for(int i=0;i<M;i++){
            tk = new StringTokenizer(br.readLine());
            int rise = Integer.parseInt(tk.nextToken());
            int run = Integer.parseInt(tk.nextToken());
            slopes[i]=(double)rise/run;
        }
        int count = 0;
        for(int i=0;i<N;i++){
            int x1,y1,x2,y2;
            x1 = coordinates[i][0];
            y1 = coordinates[i][1];
            for(int j=i+1;j<N;j++){
                x2 = coordinates[j][0];
                y2 = coordinates[j][1];
                if(Arrays.asList(slopes).contains((double)(y2-y1)/(x2-x1))){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
