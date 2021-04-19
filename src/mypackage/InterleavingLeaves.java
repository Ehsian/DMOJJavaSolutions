package mypackage;
import java.io.*;

public class InterleavingLeaves {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            String p1 = br.readLine();
            String p2 = br.readLine();
            String ans = "";
            for(int j=0;j<N;j++){
                ans = p1.charAt(j)+ans;
                ans = p2.charAt(j)+ans;
            }
            System.out.println(ans);
        }
    }
}
