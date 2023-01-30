import java.io.*;
import java.util.*;
public class DMOPC14C2P4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[]trees = new int[N];
        for(int i=0;i<N;i++){
            if(i==0){
                trees[i]=Integer.parseInt(br.readLine());
            }
            else{
                trees[i]=trees[i-1]+Integer.parseInt(br.readLine());
            }
        }
        int Q = Integer.parseInt(br.readLine());
        for(int i=0;i<Q;i++){
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(tk.nextToken());
            int b = Integer.parseInt(tk.nextToken());
            if(a==0){
                System.out.println(trees[b]);
            }else{
                System.out.println(trees[b]-trees[a-1]);
            }
        }
    }
}
