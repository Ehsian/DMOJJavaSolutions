import java.util.StringTokenizer;
import java.io.*;
public class DMOPC19C5P0 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int C = Integer.parseInt(tk.nextToken());
        for(int i=0;i<N;i++){
            tk = new StringTokenizer(br.readLine());
            String name = tk.nextToken();
            if(Integer.parseInt(tk.nextToken())<=C){
                System.out.println(name+" will not advance");
            }
            else{
                System.out.println(name+" will advance");
            }
        }
    }
}
