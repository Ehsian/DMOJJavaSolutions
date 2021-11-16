package mypackage;
import java.io.*;
import java.util.*;
public class AAC1P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(tk.nextToken());
        int R = Integer.parseInt(tk.nextToken());
        if(Math.pow(S,2)>(3.14*Math.pow(R,2))){
            System.out.println("SQUARE");
        }
        else{
            System.out.println("CIRCLE");
        }
    }
}
