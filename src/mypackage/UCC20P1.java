package mypackage;
import java.io.*;
import java.util.StringTokenizer;
public class UCC20P1 {
    public static void main(String[] args) throws IOException{
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine().replaceAll(""," ");
        StringTokenizer tk1 = new StringTokenizer(str);
        str = br.readLine().replaceAll(""," ");
        StringTokenizer tk2 = new StringTokenizer(str);
        for(int i=0;i<N;i++){
            String token = tk1.nextToken();
            if(token.equals(tk2.nextToken())&&token.equals("0")){
                count++;
            }
        }
        System.out.println(count);
    }
}
