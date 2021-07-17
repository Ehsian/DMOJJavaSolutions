import java.util.*;
import java.io.*;
public class CCC21S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int[]rows = new int[M];
        int[]columns = new int[N];
        for(int i=0;i<K;i++){
            StringTokenizer tk = new StringTokenizer(br.readLine());
            String str = tk.nextToken();
            int num = Integer.parseInt(tk.nextToken())-1;
            if(str.equals("R")){
                rows[num]++;
            }else{
                columns[num]++;
            }
        }
        int count = 0;
        for(int i=0;i<rows.length;i++){
            for(int j=0;j<columns.length;j++){
                if((columns[j]+rows[i])%2==1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
