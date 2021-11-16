import java.io.*;
import java.util.StringTokenizer;
public class DMOPC14C5P2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tk;
        int num = 0;
        int X;
        for(int i=0;i<N;i++){
            tk = new StringTokenizer(br.readLine());
            X = -Integer.parseInt(tk.nextToken())+Integer.parseInt(tk.nextToken());
            if(X>num){
                num=X;
            }
        }
        System.out.println(num);
    }
}
