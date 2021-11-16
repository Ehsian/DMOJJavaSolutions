import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Towers {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int N = Integer.parseInt(br.readLine());
        int[]T=new int[N];
        StringTokenizer tk = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            T[i]=Integer.parseInt(tk.nextToken());
        }
        for(int i=1;i<N-1;i++){
            if(T[i]>T[i-1]&&T[i]<T[i+1]){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
