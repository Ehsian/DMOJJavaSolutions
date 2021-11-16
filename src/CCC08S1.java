import java.io.*;
import java.util.StringTokenizer;
public class CCC08S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lowestStr = null;
        int lowestNum = 0;
        while(true){
            StringTokenizer tk = new StringTokenizer(br.readLine());
            String str = tk.nextToken();
            int num = Integer.parseInt(tk.nextToken());
            if(lowestStr==null){
                lowestStr = str;
                lowestNum = num;
            }
            else if(num<lowestNum){
                lowestStr = str;
                lowestNum = num;
            }
            if(str.equals("Waterloo")){
                break;
            }
        }
        System.out.println(lowestStr);
    }
}
