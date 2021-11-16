import java.io.*;
import java.util.*;
public class AvocadoTrees {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int Q = Integer.parseInt(tk.nextToken());
        int H = Integer.parseInt(tk.nextToken());
        int num = 0;
        int[]yields = new int[N];
        int[]prefixsum = new int[N];
        for(int i=0;i<N;i++){
            tk = new StringTokenizer(br.readLine());
            if(Integer.parseInt(tk.nextToken())<=H){
                yields[i]=Integer.parseInt(tk.nextToken());
            }
            else{
                yields[i]=0;
            }
        }
        prefixsum[0]=yields[0];
        for(int i=1;i<N;i++){
            prefixsum[i]=prefixsum[i-1]+yields[i];
        }
        for(int i=0;i<Q;i++){
            tk = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(tk.nextToken());
            int r = Integer.parseInt(tk.nextToken());
            if(l==1){
                num = Math.max(num,prefixsum[r-1]);
            }
            else{
                num = Math.max(num,Math.max(0,prefixsum[r-1])-prefixsum[l-2]);
            }
        }
        System.out.println(num);
    }
}
