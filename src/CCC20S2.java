import java.io.*;
import java.util.*;
public class CCC20S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[][]arr = new int[M][N];
        for(int i=0;i<M;i++){
            tk = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                arr[i][j]=Integer.parseInt(tk.nextToken());
            }
        }
        DFS(arr,M,N);
    }
    public static void DFS(int[][]arr,int M,int N){
        Stack<Integer>stack = new Stack<>();
        HashSet<Integer>visited = new HashSet<>();
        stack.push(arr[0][0]);
        while(!stack.isEmpty()){
            int current = stack.pop();
            if(M*N==current){
                System.out.println("yes");
                return;
            }
            if(!visited.contains(current)){
                visited.add(current);
                for(int i=1;i<=M;i++){
                    if(current/i<=N&&current/i*i==current){
                        stack.push(arr[i-1][current/i-1]);
                    }
                }
            }
        }
        System.out.println("no");
    }
}
