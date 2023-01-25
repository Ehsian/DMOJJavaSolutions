import java.io.*;
import java.util.*;
public class AAC3P2_Outdated {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(tk.nextToken());
        int D = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(br.readLine());
        int smallest = Integer.parseInt(tk.nextToken());
        boolean check = false;
        for(int i=0;i<D-1;i++){
            int num = Integer.parseInt(tk.nextToken());
            if(smallest==0){
                smallest=num;
            }
            if(num<smallest){
                if(num==0){
                    check = true;
                }else{
                    smallest = num;
                }
            }
        }
        if(smallest==0){
            System.out.println("-1");
        }
        else if(check){
            for(int i=0;i<K-1;i++){
                System.out.print("0");
            }
            System.out.println(smallest);
        }
        else{
            for(int i=0;i<K;i++){
                System.out.print(smallest);
            }
            System.out.println();
        }
    }
}
