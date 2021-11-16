import java.io.*;
public class CCC11J3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t1 = Integer.parseInt(br.readLine());
        int t2 = Integer.parseInt(br.readLine());
        int ans = 2;
        while(t2<=t1){
            int T=t1;
            t1=t2;
            t2=T-t2;
            ans++;
        }
        System.out.println(ans);
    }
}
