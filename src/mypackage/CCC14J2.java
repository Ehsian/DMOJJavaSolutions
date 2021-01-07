package mypackage;
import java.io.*;
import java.util.StringTokenizer;
public class CCC14J2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A=0,B=0;
        StringTokenizer tk = new StringTokenizer(br.readLine().replaceAll(""," "));
        for(int i=0;i<N;i++){
            if(tk.nextToken().equals("A")){
                A++;
            }
            else{
                B++;
            }
        }
        if(A>B){
            System.out.println("A");
        }else if(B>A){
            System.out.println("B");
        }else{
            System.out.println("Tie");
        }
    }
}
