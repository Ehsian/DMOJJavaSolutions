import java.io.*;
import java.util.*;
public class VaccineDistribution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());
        boolean[][]graph = new boolean[N][N];
        for(int i=0;i<M;i++){
            tk = new StringTokenizer(br.readLine());
            int cityx = Integer.parseInt(tk.nextToken())-1;
            int cityy = Integer.parseInt(tk.nextToken())-1;
            graph[cityx][cityy] = true;
            graph[cityy][cityx] = true;
        }
        System.out.println(BFS(N,graph));
    }
    public static int BFS(int N,boolean[][]graph){
        int vaccinated = 0;
        HashSet<Integer>visited = new HashSet<>();
        Queue<Integer>queue = new ArrayDeque<>();
        queue.add(0);
        queue.add(-1);
        while(queue.size()>1){
            int currentcity = queue.poll();
            if(currentcity==-1){
                vaccinated++;
                queue.add(-1);
                continue;
            }
            if(!visited.contains(currentcity)){
                visited.add(currentcity);
                for(int i=0;i<N;i++){
                    if(graph[currentcity][i]){
                        queue.add(i);
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
            if(!visited.contains(i)){
                vaccinated++;
            }
        }
        return vaccinated-1;
    }
}
