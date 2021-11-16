import java.io.*;
import java.util.Arrays;
public class CCC00S4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(br.readLine()); //distance
        int numclubs = Integer.parseInt(br.readLine()); //num of clubs
        int[]clubs = new int[numclubs];
        for(int i=0;i<numclubs;i++){
            clubs[i]=Integer.parseInt(br.readLine());
        }
        int ans = solve(d,clubs);
        if(ans==-1){
            System.out.println("Roberta acknowledges defeat.");
        }else{
            System.out.println("Roberta wins in "+ans+" strokes.");
        }
    }
    public static int solve(int d,int[]clubs){
        int[]array = new int[d+1];
        for(int i=1;i<=d;i++){
            int minimum = Integer.MAX_VALUE;
            for(int club:clubs){
                int num = i-club;
                if (num>=0 && array[num]>=0 && array[num]<minimum){
                    minimum = array[num];
                }
            }
            if(minimum!=Integer.MAX_VALUE){
                array[i]=minimum+1;
            }
            else{
                array[i]=-1;
            }
        }
        return array[d];
    }
}
