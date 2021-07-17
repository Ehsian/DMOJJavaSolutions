package mypackage;
import java.io.*;
import java.util.*;
public class ccc21 {
    public static void main(String[] args) throws IOException {
        //S1 - Crazy Fencing:
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());
        double area = 0;
        int left = Integer.parseInt(tk.nextToken());
        int right = Integer.parseInt(tk.nextToken());
        int[]leftheights = new int[N];
        int[]rightheights = new int[N];
        int[]triangleheights = new int[N];
        triangleheights[0] = Math.abs(left-right);
        leftheights[0] = left;
        rightheights[0] = right;
        for(int i=1;i<N;i++){
            left = right;
            right = Integer.parseInt(tk.nextToken());
            triangleheights[i]=Math.abs(left-right);
            leftheights[i] = left;
            rightheights[i] = right;
        }
        tk = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int width = Integer.parseInt(tk.nextToken());
            area+=width*Math.min(leftheights[i],rightheights[i])+(double)width*triangleheights[i]/2;
        }
        System.out.println(area);*/

        //S2 - Modern Art
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int[]rows = new int[M];
        int[]columns = new int[N];
        for(int i=0;i<K;i++){
            StringTokenizer tk = new StringTokenizer(br.readLine());
            String str = tk.nextToken();
            int num = Integer.parseInt(tk.nextToken())-1;
            if(str.equals("R")){
                rows[num]++;
            }else{
                columns[num]++;
            }
        }
        int count = 0;
        for(int i=0;i<rows.length;i++){
            for(int j=0;j<columns.length;j++){
                if((columns[j]+rows[i])%2==1){
                    count++;
                }
            }
        }
        System.out.println(count);
        */

        //S3 - Lunch Concert -- INCORRECT/INCOMPLETE

        //S4 - Daily Commute -- INCORRECT/INCOMPLETE
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int W = Integer.parseInt(tk.nextToken());
        int D = Integer.parseInt(tk.nextToken());
        boolean[][]walkway = new boolean[N][N];
        int[]stations = new int[N];
        for(int i=0;i<W;i++){
            tk = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(tk.nextToken())-1;
            int B = Integer.parseInt(tk.nextToken())-1;
            walkway[A][B] = true;
        }
        tk = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            stations[i]=Integer.parseInt(tk.nextToken())-1;
        }
        for(int i=0;i<D;i++){
            tk = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(tk.nextToken())-1;
            int Y = Integer.parseInt(tk.nextToken())-1;
            int temp = stations[X];
            stations[X]=stations[Y];
            stations[Y]=stations[temp];
            System.out.println(BFS(walkway,stations,N));
        }
    }
    public static int BFS(boolean[][]walkway,int[] stations,int N){
        int minutes = 0;
        HashSet<Integer>visited = new HashSet<>();
        Queue<Integer>queue = new ArrayDeque<>();
        queue.add(0);
        int stationindex = 0;
        while(!queue.isEmpty()){
            int currentstation = queue.poll();
            if(currentstation==N-1){
                return minutes;
            }
            if(!visited.contains(currentstation)){
                visited.add(currentstation);
                for(int i=0;i<N;i++){
                    if(walkway[currentstation][i]){
                        queue.add(i);
                    }
                }
                queue.add(stations[stationindex+1]);
            }
            minutes++;
        }
        return minutes;
    }
}