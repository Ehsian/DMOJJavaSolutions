import java.io.*;
import java.io.InputStreamReader;

public class DMOPC14C5P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((3.14159*Math.pow(Integer.parseInt(br.readLine()),2)*Integer.parseInt(br.readLine()))/3);
    }
}
