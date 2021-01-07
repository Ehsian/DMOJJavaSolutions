package mypackage;
import java.io.*;
import java.util.*;
public class CCC16S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[]dmoj = new int[N];
        Integer[]pej = new Integer[N];
        int ans = 0;
        StringTokenizer tk1 = new StringTokenizer(br.readLine());
        StringTokenizer tk2 = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            dmoj[i] = Integer.parseInt(tk1.nextToken());
            pej[i] = Integer.parseInt(tk2.nextToken());
        }
        Arrays.sort(dmoj);
        if(Q==1){
            Arrays.sort(pej);
            for(int i=0;i<N;i++){
                ans+=Math.max(dmoj[i],pej[i]);
            }
        }
        else{
            Arrays.sort(pej,Collections.reverseOrder());
            for(int i=0;i<N;i++){
                ans+=Math.max(dmoj[i],pej[i]);
            }
        }
        System.out.println(ans);
    }
}
