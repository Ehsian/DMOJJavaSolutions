package mypackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class sixteenbitSWonly {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String in = br.readLine();
            StringTokenizer tk = new StringTokenizer(in);
            long A = Long.parseLong(tk.nextToken());
            long B = Long.parseLong(tk.nextToken());
            long P = Long.parseLong(tk.nextToken());
            if(A*B==P){
                System.out.println("POSSIBLE DOUBLE SIGMA");
            }
            else{
                System.out.println("16 BIT S/W ONLY");
            }
        }
    }
}
