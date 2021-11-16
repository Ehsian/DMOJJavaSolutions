import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC03S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;
        while(true){
            int roll = Integer.parseInt(br.readLine());
            if(roll==0){
                System.out.println("You Quit!");
                break;
            }
            else if(num+roll>100);
            else{
                num+=roll;
            }
            switch(num){
                case 9:
                    num=34;
                    break;
                case 40:
                    num=64;
                    break;
                case 54:
                    num=19;
                    break;
                case 67:
                    num=86;
                    break;
                case 90:
                    num=48;
                    break;
                case 99:
                    num=77;
                    break;
            }
            System.out.println("You are now on square "+num);
            if(num==100){
                System.out.println("You Win!");
                break;
            }
        }
    }
}
