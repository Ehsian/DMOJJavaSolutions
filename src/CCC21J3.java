package mypackage;
import java.io.*;
public class CCC21J3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String direction = "";
        while(num!=99999){
            if(num/10000==0&&num%10000/1000==0){ }
            else if((num/10000+num%10000/1000)%2==0){
                direction = "right ";
            }else{
                direction = "left ";
            }
            System.out.println(direction + num%1000);
            num = Integer.parseInt(br.readLine());
        }
    }
}
