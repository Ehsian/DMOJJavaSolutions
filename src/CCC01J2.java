import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC01J2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        boolean intexists = false;
        for(int n=0;n<=100;n++){
            if(x*n%m==1){
                System.out.println(n);
                intexists = true;
                break;
            }
        }
        if(intexists==false){
            System.out.println("No such integer exists.");
        }
    }
}
