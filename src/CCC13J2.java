import java.io.*;
import java.util.StringTokenizer;
public class CCC13J2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean check = true;
        StringTokenizer tk = new StringTokenizer(str.replaceAll(""," "));
        for(int i=0;i<str.length();i++){
            String token = tk.nextToken();
            if(token.equals("I")||token.equals("O")||token.equals("S")||token.equals("N")
                    ||token.equals("H")||token.equals("Z")||token.equals("X")){
            }
            else{
                check = false;
            }
        }
        if(check){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
