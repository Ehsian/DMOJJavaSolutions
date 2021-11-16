import java.math.BigInteger;
import java.io.*;

public class NextPrime {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        while(N.isProbablePrime(1)!=true){
            N = new BigInteger(""+(Integer.parseInt(""+N)+1));
        }
        System.out.println(N);
    }
}
