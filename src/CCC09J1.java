import java.io.*;
public class CCC09J1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The 1-3-sum is "+(91+Integer.parseInt(br.readLine())+Integer.parseInt(br.readLine())*3+Integer.parseInt(br.readLine())));
    }
}
