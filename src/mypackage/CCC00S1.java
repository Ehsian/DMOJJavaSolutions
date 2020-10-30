package mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC00S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int m1 = Integer.parseInt(br.readLine());
        int m2 = Integer.parseInt(br.readLine());
        int m3 = Integer.parseInt(br.readLine());
        int count = 0;
        while(num>0){
            num--;
            m1++;
            count++;
            if(m1==35){
                num+=30;
                m1=0;
            }
            else if(num==0){
                break;
            }
            num--;
            m2++;
            count++;
            if(m2==100){
                num+=60;
                m2=0;
            }
            else if(num==0){
                break;
            }
            num--;
            m3++;
            count++;
            if(m3==10){
                num+=9;
                m3=0;
            }
        }
        System.out.println("Martha plays "+count+" times before going broke.");
    }
}