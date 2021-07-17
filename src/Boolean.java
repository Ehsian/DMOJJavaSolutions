import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boolean {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = (str.length()-4)/4;;
        if(str.contains("True")){
            if(count%2==0){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        else if(str.contains("False")){
            if(count%2==0){
                System.out.println("False");
            }
            else{
                System.out.println("True");
            }
        }
    }
}
