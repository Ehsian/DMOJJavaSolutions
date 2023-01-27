import java.io.*;
import java.util.*;
public class CCC18S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        for(int i=0;i<N;i++){
            StringTokenizer tk = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                arr[i][j]=Integer.parseInt(tk.nextToken());
            }
        }

        if(arr[0][0]<arr[N-1][0]&&arr[0][0]<arr[0][N-1]){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } else if(arr[0][N-1]<arr[N-1][N-1]&&arr[0][N-1]<arr[0][0]){
            for(int i=N-1;i>=0;i--){
                for(int j=0;j<N;j++){
                    System.out.print(arr[j][i] + " ");
                }
                System.out.println();
            }
        } else if(arr[N-1][N-1]<arr[N-1][0]&&arr[N-1][N-1]<arr[0][N-1]){
            for(int i=N-1;i>=0;i--){
                for(int j=N-1;j>=0;j--){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            for(int i=0;i<N;i++){
                for(int j=N-1;j>=0;j--){
                    System.out.print(arr[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}
