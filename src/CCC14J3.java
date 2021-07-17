import java.io.*;
import java.util.StringTokenizer;
public class CCC14J3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Antonia = 100,David = 100;
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(tk.nextToken());
            int d = Integer.parseInt(tk.nextToken());
            if(a>d){
                David-=a;
            }else if(d>a){
                Antonia-=d;
            }
        }
        System.out.println(Antonia);
        System.out.println(David);
    }
}
