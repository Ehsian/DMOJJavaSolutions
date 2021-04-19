package mypackage;
import java.io.*;
import java.util.Arrays;
public class CCC00S4 { //Incorrect Currently
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int distance = Integer.parseInt(br.readLine());
        int strokes = 0;
        int N = Integer.parseInt(br.readLine());
        int[]clubs = new int[N];
        for(int i=0;i<N;i++){
            clubs[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(clubs);
        for(int i=N-1;i>=0;i--){
            if(distance>=clubs[i]){
                strokes+=distance/clubs[i];
                distance%=clubs[i];
            }
        }
        if(distance==0){
            System.out.println("Roberta wins in "+strokes+" strokes.");
        }
        else{
            System.out.println("Roberta acknowledges defeat.");
        }
    }
}
