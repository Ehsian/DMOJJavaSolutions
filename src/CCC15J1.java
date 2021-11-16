import java.io.*;
import java.util.*;
public class CCC15J1 {
    public static void main(String[] args) throws IOException {
        int month,day;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        month = Integer.parseInt(br.readLine());
        day = Integer.parseInt(br.readLine());
        if(month>2){
            System.out.println("After");
        }else if(month<2){
            System.out.println("Before");
        }else{
            if(day<18){
                System.out.println("Before");
            }else if(day>18){
                System.out.println("After");
            }else{
                System.out.println("Special");
            }
        }
    }
}
