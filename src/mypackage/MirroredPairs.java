package mypackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MirroredPairs {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ready");
        while(true){
            String str = br.readLine();
            if(str.equals("  ")){
                break;
            }
            else if(str.contains("b")&&str.contains("d")||str.contains("p")&&str.contains("q")){
                System.out.println("Mirrored pair");
            }
            else{
                System.out.println("Ordinary pair");
            }
        }
    }
}
