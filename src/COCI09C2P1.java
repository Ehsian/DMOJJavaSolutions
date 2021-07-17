import java.io.*;
import java.util.StringTokenizer;
public class COCI09C2P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        System.out.println(Integer.parseInt(tk.nextToken())*(Integer.parseInt(tk.nextToken())-1)+1);
    }
}
