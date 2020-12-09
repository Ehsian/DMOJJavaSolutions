package mypackage;
import java.util.*;
import java.io.*;
public class VeraAndOutfits {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i!=j){
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
