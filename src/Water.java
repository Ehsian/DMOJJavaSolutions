import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Water {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int jar1 = Integer.parseInt(br.readLine());
        int jar2 = Integer.parseInt(br.readLine());
        int jar3 = Integer.parseInt(br.readLine());
        if(jar1>jar2&&jar1>jar3){
            System.out.println(jar1-jar2);
        }
        else if(jar2>jar1&&jar2>jar3){
            System.out.println(jar2-jar1);
        }
        else{
            System.out.println(jar3-jar1);
        }
    }
}
