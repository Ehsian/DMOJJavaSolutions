package mypackage;
import java.io.*;
public class CCC11S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[]test = new String[N];
        int correct = 0;
        for(int i=0;i<N;i++){
            test[i]=br.readLine();
        }
        for(int i=0;i<N;i++){
            if(br.readLine().equals(test[i])){
                correct++;
            }
        }
        System.out.println(correct);
    }
}
