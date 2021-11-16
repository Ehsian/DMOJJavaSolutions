import java.io.*;
public class CCC12J1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());
        if(limit>=speed){
            System.out.println("Congratulations, you are within the speed limit!");
        }
        else if(speed-limit>30){
            System.out.println("You are speeding and your fine is $500.");
        }
        else if(speed-limit>20&&speed-limit<31){
            System.out.println("You are speeding and your fine is $270.");
        }
        else if(speed-limit>0&&speed-limit<21){
            System.out.println("You are speeding and your fine is $100.");
        }
    }
}
