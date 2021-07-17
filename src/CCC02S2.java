import java.io.*;
public class CCC02S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if(a/b>=1){
            System.out.print(a/b);
        }
        if(a-(a/b)*b!=0){
            System.out.println(" "+(a-(a/b)*b)/GCD(a,b)+"/"+(b/GCD(a,b)));
        }
    }
    public static int GCD(int a,int b){
        if (b==0) return a;
        return GCD(b,a%b);
    }
}
