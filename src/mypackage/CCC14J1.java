package mypackage;
import java.io.*;

public class CCC14J1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        if(A==B&&A==C&&A==60){
            System.out.println("Equilateral");
        }
        else if(A+B+C!=180){
            System.out.println("Error");
        }
        else if(A==B&&A!=C||A==C&&A!=B||B==C&&B!=A){
            System.out.println("Isosceles");
        }
        else{
            System.out.println("Scalene");
        }
    }
}
