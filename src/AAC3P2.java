import java.util.*;
import java.io.*;

public class AAC3P2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(tk.nextToken());
        int D = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(br.readLine());
        boolean has0 = false;
        int smallest = 0;
        for(int i=0;i<D;i++){
            int N = Integer.parseInt(tk.nextToken());
            if(N==0){
                has0 = true;
            }
            else if(smallest==0){
                smallest = N;
            }
            else if(N < smallest){
                smallest = N;
            }
        }
        if(smallest==0){
            System.out.println(-1);
        }
        else if(has0){
            if(K <= 2){
                System.out.println((smallest+"").repeat(K));
                return;
            }
            System.out.print(smallest);
            System.out.print((0+"").repeat(K-2));
            System.out.println(smallest);
        }
        else{
            System.out.println((smallest+"").repeat(K));
        }
    }
}
