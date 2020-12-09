package mypackage;
import java.io.*;
import java.util.*;
public class PIB20P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int ans = 0;
        for(int i=0;i<N;i++){
            if(Integer.parseInt(tk.nextToken())>0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
