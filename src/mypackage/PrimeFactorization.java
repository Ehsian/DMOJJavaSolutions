package mypackage;
import java.io.*;
public class PrimeFactorization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) {
            int num = 3;
            int M = Integer.parseInt(br.readLine());
            while(M%2==0){
                M/=2;
                System.out.print("2 ");
            }
            while(M!=1){
                if(M%num==0){
                    M/=num;
                    System.out.print(num+" ");
                    continue;
                }
                if(num>Math.sqrt(M)){
                    num=M;
                    continue;
                }
                num+=2;
            }
            System.out.println();
        }
    }
}
