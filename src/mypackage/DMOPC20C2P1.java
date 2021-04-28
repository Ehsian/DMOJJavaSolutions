package mypackage;
import java.util.*;
import java.io.*;
public class DMOPC20C2P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[]chars;
        String[][]map = new String[N][N];
        for(int i=0;i<N;i++){
            int down=0;
            int up=0;
            int row;
            chars=br.readLine().split("");
            for(String str:chars){
                if(str.equals("v")){
                    down++;
                }
                else if(str.equals("^")){
                    up++;
                }
            }
        }
    }
}
