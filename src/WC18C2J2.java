import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class WC18C2J2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]parts = br.readLine().split(":");
        System.out.println(Integer.parseInt(parts[0])*60+Integer.parseInt(parts[1]));
    }
}
