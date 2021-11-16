import java.io.*;
import java.util.*;
public class AC20P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;
        int[]triangle = new int[3];
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            tk = new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++){
                triangle[j]=Integer.parseInt(tk.nextToken());
            }
            Arrays.sort(triangle);
            int a = triangle[0];
            int b = triangle[1];
            int c = triangle[2];
            if(Math.pow(a,2)+Math.pow(b,2)<Math.pow(c,2)){
                System.out.println("O");
            } else if(Math.pow(a,2)+Math.pow(b,2)>Math.pow(c,2)){
                System.out.println("A");
            } else{
                System.out.println("R");
            }
        }
    }
}
