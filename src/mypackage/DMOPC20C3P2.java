package mypackage;
import java.io.*;
import java.util.*;
public class DMOPC20C3P2 { //TLE
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(tk.nextToken());
        int N = Integer.parseInt(tk.nextToken());
        int[][]arr = new int[M][N];
        int K = Integer.parseInt(tk.nextToken());
        int num = 0;
        for(int i=0;i<M;i++){
            tk = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                arr[i][j] = Integer.parseInt(tk.nextToken());
            }
        }
        for(int i=0;i<M;i++){
            for(int j=i+1;j<M;j++){
                for(int k=1;k<N;k++){
                    if(Math.abs(arr[i][k]-arr[j][k])==K){
                        if(arr[i][k]-arr[j][k]==arr[i][k-1]-arr[j][k-1]){
                            num++;
                        }
                    }
                }
            }
        }
        System.out.println(num);
    }
}
