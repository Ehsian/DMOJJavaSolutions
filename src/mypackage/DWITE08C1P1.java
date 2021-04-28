package mypackage;
import java.io.*;
import java.util.Arrays;
public class DWITE08C1P1 { //INCOMPLETE
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x=0;
        int y=4;
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int columns = Math.abs(a*2-1)+Math.abs(b*2-1)+Math.abs(c*2-1)+Math.abs(d*2-1)+Math.abs(e*2-1);
        char[][]array = new char[5][columns];
        for(char[]row:array){
            Arrays.fill(row,'.');
        }
        for(int i=0;i<3;)
        for(char[]row:array){
            for(char chr:row){
                System.out.print(chr);
            }
            System.out.println();
        }
    }
}
