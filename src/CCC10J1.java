import java.io.*;
import java.util.*;

public class CCC10J1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                if(i+j==num&&i>=j){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
