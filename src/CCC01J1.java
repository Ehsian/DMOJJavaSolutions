import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC01J1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int H = Integer.parseInt(br.readLine());
        int count;
        for(int i=0;i<=(H/2);i++){
            count = 0;
            for(int j=1;j<=i*2+1;j++){
                System.out.print("*");
                count++;
            }
            for(int k=0;k<(H*2)-(count*2);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=(H/2)-1;i>=0;i--){
            count = 0;
            for(int j=1;j<=i*2+1;j++){
                System.out.print("*");
                count++;
            }
            for(int k=0;k<(H*2)-(count*2);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
