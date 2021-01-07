package mypackage;
import java.io.*;
import java.util.Arrays;
public class CCC13J4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int ans = 0;
        int T = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int[]chores = new int[C];
        for(int i=0;i<C;i++){
            chores[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(chores);
        for(int i=0;i<C;i++){
            if(num+chores[i]<=T){
                num+=chores[i];
                ans++;
            }
            else{
                break;
            }
        }
        System.out.println(ans);
    }
}
