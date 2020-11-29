package mypackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CCC19J1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = 0;
        int B = 0;
        A+=Integer.parseInt(br.readLine())*3;
        A+=Integer.parseInt(br.readLine())*2;
        A+=Integer.parseInt(br.readLine());
        B+=Integer.parseInt(br.readLine())*3;
        B+=Integer.parseInt(br.readLine())*2;
        B+=Integer.parseInt(br.readLine());
        if(B>A){
            System.out.println("B");
        }
        else if(A>B){
            System.out.println("A");
        }
        else{
            System.out.println("T");
        }
    }
}
