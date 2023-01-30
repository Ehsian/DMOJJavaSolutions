import java.io.*;
import java.util.*;

public class DMOPC21C4P1 { //WA but don't know why :(
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int Q = Integer.parseInt(tk.nextToken());
        int[][]coordinates = new int[N][6];
        for(int i=0;i<N;i++){
            tk = new StringTokenizer(br.readLine());
            coordinates[i][0]=Integer.parseInt(tk.nextToken());
            coordinates[i][1]=Integer.parseInt(tk.nextToken());
            coordinates[i][2]=Integer.parseInt(tk.nextToken());
            coordinates[i][3]=Integer.parseInt(tk.nextToken());
            coordinates[i][4]=Integer.parseInt(tk.nextToken());
            coordinates[i][5]=Integer.parseInt(tk.nextToken());
        }
        for(int i=0;i<Q;i++){
            int amount = 0;
            tk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(tk.nextToken());
            int y = Integer.parseInt(tk.nextToken());
            for(int j=0;j<N;j++){
                if(inTriangle(coordinates[j][0],coordinates[j][1],coordinates[j][2],coordinates[j][3],coordinates[j][4],coordinates[j][5],x,y)){
                    amount++;
                }
            }
            System.out.println(amount);
        }
    }
    public static double getArea(int x1,int y1,int x2,int y2,int x3,int y3){
        return Math.abs((double)(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2);
    }
    public static boolean inTriangle(int x1,int y1,int x2,int y2,int x3,int y3,int x,int y){
        double area = getArea(x1,y1,x2,y2,x3,y3);
        double subArea1 = getArea(x,y,x2,y2,x3,y3);
        double subArea2 = getArea(x1,y1,x,y,x3,y3);
        double subArea3 = getArea(x1,y1,x2,y2,x,y);
        return area == subArea1 + subArea2 + subArea3;
    }
}
