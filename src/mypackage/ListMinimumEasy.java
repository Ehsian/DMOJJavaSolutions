package mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ListMinimumEasy {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=1;i<=N;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
