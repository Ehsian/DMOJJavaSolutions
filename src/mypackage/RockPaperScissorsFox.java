package mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockPaperScissorsFox {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            String str = br.readLine();
            if(str.equals("Scissors")){System.out.println("Rock");}
            else if(str.equals("Rock")){System.out.println("Paper");}
            else if(str.equals("Paper")){System.out.println("Scissors");}
            else if(str.equals("Fox")){System.out.println("Foxen");}
            else{
                break;
            }
        }
    }
}
