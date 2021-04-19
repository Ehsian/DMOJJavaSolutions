package mypackage;
import java.io.*;
public class UTSO21P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int numeven = 1;
        int numodd = 2;
        int S = 1;
        while(numeven<N&&numodd<N){
            S++;
            if(S%2==0){
                numeven+=2*S;
            }else if(S%2==1){
                numodd+=2*S;
            }
        }
        System.out.println(S);

        /*
        int num = 2;
        int increment = 3;
        while(true){
            if(num>=N){
                break;
            }
            if(S%2==0){
                increment+=2;
            }
            S++;
            num+=increment;
        }
        System.out.println(S);
        */
    }
}
