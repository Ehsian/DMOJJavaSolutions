package mypackage;
import java.io.*;
public class DWITE09C5P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++) {
            int N = Integer.parseInt(br.readLine());
            if(N<0){
                for(int j=-5;j<N;j++){
                    System.out.print("-");
                }
                for(int j=N;j<0;j++){
                    System.out.print("*");
                }
                System.out.print("|");
                System.out.println("-----");
            }
            else if(N>0){
                System.out.print("-----");
                System.out.print("|");
                for(int j=0;j<N;j++){
                    System.out.print("*");
                }
                for(int j=5;j>N;j--){
                    System.out.print("-");
                }
                System.out.println();
            }
            else{
                System.out.println("-----|-----");
            }
        }
    }
}
