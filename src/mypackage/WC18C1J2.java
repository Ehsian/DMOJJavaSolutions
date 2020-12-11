package mypackage;
import java.io.*;
public class WC18C1J2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        for(int i=0;i<5;i++){
            if(br.readLine().equals(N)){
                System.out.println("Y");
                break;
            }
            else if(i==4){
                System.out.println("N");
            }
        }
    }
}
