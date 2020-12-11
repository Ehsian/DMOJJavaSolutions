package mypackage;
import java.io.*;
import java.util.StringTokenizer;
public class DMOPC19C6P0 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(tk.nextToken());
        int b = Integer.parseInt(tk.nextToken());
        int c = Integer.parseInt(tk.nextToken());
        if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
