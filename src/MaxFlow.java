import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MaxFlow {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            int largest = 0;
            for(int j=0;j<N;j++){
                int F = Integer.parseInt(br.readLine());
                if(F>largest){
                    largest = F;
                }
            }
            System.out.println(largest);
        }
    }
}
