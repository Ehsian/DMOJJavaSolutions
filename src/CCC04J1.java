import java.io.*;
public class CCC04J1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The largest square has side length "+(int)Math.floor(Math.sqrt(Integer.parseInt(br.readLine())))+".");
    }
}
