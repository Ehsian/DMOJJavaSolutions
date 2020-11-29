package mypackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CCC19J2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        for(int i=0;i<L;i++){
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(tk.nextToken());
            String x = tk.nextToken();
            for(int j=0;j<N;j++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
