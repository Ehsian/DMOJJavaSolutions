import java.util.*;
import java.io.*;
public class CCC21S1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());
        double area = 0;
        int left = Integer.parseInt(tk.nextToken());
        int right = Integer.parseInt(tk.nextToken());
        int[]leftheights = new int[N];
        int[]rightheights = new int[N];
        int[]triangleheights = new int[N];
        triangleheights[0] = Math.abs(left-right);
        leftheights[0] = left;
        rightheights[0] = right;
        for(int i=1;i<N;i++){
            left = right;
            right = Integer.parseInt(tk.nextToken());
            triangleheights[i]=Math.abs(left-right);
            leftheights[i] = left;
            rightheights[i] = right;
        }
        tk = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int width = Integer.parseInt(tk.nextToken());
            area+=width*Math.min(leftheights[i],rightheights[i])+(double)width*triangleheights[i]/2;
        }
        System.out.println(area);
    }
}
