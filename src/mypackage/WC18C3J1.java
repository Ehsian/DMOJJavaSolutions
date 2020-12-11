package mypackage;
import java.io.*;
public class WC18C3J1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        System.out.println(P/B*D+P%B);
    }
}
