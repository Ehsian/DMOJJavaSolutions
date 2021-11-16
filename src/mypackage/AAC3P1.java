package mypackage;
import java.io.*;
import java.util.*;
public class AAC3P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int A,B,C,D;
        A = Integer.parseInt(tk.nextToken());
        B = Integer.parseInt(tk.nextToken());
        C = Integer.parseInt(tk.nextToken());
        D = Integer.parseInt(tk.nextToken());
        if(A<B&&C<D){
            System.out.println("Go to the department store");
        }else if(A<B&&C>=D){
            System.out.println("Go to the grocery store");
        }else if(A>=B&&C<D){
            System.out.println("Go to the pharmacy");
        }else{
            System.out.println("Stay home");
        }
    }
}
