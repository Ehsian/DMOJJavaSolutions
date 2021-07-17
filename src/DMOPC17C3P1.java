import java.io.*;
import java.util.StringTokenizer;
public class DMOPC17C3P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(tk.nextToken());
        for(int i=0;i<N-1;i++){
            int next = Integer.parseInt(tk.nextToken());
            if(next<num){
                num=next;
            }
        }
        System.out.println(num);
    }
}
