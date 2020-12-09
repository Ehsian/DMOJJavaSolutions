package mypackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class WC17C4J1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String C = br.readLine();
        if(C.equals(br.readLine())){
            System.out.println(C);
        }else{
            System.out.println("Undecided");
        }
    }
}
