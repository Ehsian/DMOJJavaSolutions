package mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AC19P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            int C = Integer.parseInt(br.readLine());
            int a,b,c;
            if(N<=C){
                c=N;
                System.out.println("0 0 "+c);
            }
            else if(N>C&&N<=B+C){
                b = N-C;
                System.out.println("0 "+b+" "+C);
            }
            else if(N>B+C&&N<=A+B+C){
                a = N-B-C;
                System.out.println(a+" "+B+" "+C);
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
