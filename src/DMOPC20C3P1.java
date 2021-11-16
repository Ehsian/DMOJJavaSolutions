import java.io.*;
import java.util.*;
public class DMOPC20C3P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[]friends = new int[N];
        StringTokenizer tk = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            friends[i]=Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(friends);
        boolean check = true;
        for(int i=1;i<N;i++){
            if(friends[i]==friends[i-1]){
                check = false;
            }
        }
        if(check){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
