package mypackage;
import java.io.*;
import java.util.*;

public class AvocadoThief {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());
        int K = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(tk.nextToken());
        int Y = Integer.parseInt(tk.nextToken());
        int[][]map = new int[N][N];
        for(int i=0;i<M;i++){
            tk = new StringTokenizer(br.readLine());
            int b1 = Integer.parseInt(tk.nextToken())-1;
            int b2 = Integer.parseInt(tk.nextToken())-1;
            if(tk.nextToken().equals("R")){
                map[b1][b2]=0;
                map[b2][b1]=0;
            }
            else{
                map[b1][b2]=1;
                map[b2][b1]=1;
            }
        }
        System.out.println(BFS(X,N,map));
        if(false){
            System.out.println("Caught");
        } else{
            System.out.println("Escape");
        }
    }
    public static int BFS(int start,int N,int[][]map){
        System.out.println("BFS Started");
        HashSet<Integer>visited = new HashSet<>();
        Queue<Integer>queue = new ArrayDeque<>();
        int mins = 0;
        queue.add(start);
        while(!queue.isEmpty()){
            int currentbuilding = queue.poll();
            if(currentbuilding==N-1){
                return mins;
            }
            if(!visited.contains(currentbuilding)){
                visited.add(currentbuilding);
                for(int i=0;i<N;i++){
                    if(map[currentbuilding][i]==0){
                        queue.add(i);
                    }
                    else if(map[currentbuilding][i]==1){
                        queue.add(i);
                    }
                }
                mins++;
            }
        }
        return -1;
    }
}
