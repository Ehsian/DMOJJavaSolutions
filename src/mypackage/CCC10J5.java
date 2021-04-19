package mypackage;
import java.io.*;
import java.util.*;
public class CCC10J5 {
    static int[]movex = {2,2,-2,-2,1,1,-1,-1};
    static int[]movey = {1,-1,1,-1,2,-2,2,-2};
    public static boolean isValid(int x,int y){
        if(x<0||x>=8||y<0||y>=8){
            return false;
        }
        return true;
    }
    public static class node{
        int x,y,moves;
        public node(int x,int y){
            this.x = x;
            this.y = y;
        }
        public node(int x,int y,int moves){
            this.x = x;
            this.y = y;
            this.moves = moves;
        }
    }
    public static int bfs(node startpos,node endpos){
        HashSet<node>visited = new HashSet<>();
        Queue<node>queue = new ArrayDeque<>();
        queue.add(startpos);
        while(!queue.isEmpty()){
            node currentNode = queue.poll();
            int x = currentNode.x;
            int y = currentNode.y;
            int moves = currentNode.moves;
            if(x==endpos.x&&y==endpos.y){
                return moves;
            }
            if(!visited.contains(currentNode)){
                visited.add(currentNode);
                for(int i=0;i<8;i++){
                    if(isValid(x+movex[i],y+movey[i])){
                        queue.add(new node(x+movex[i],y+movey[i],moves+1));
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        node start = new node(Integer.parseInt(tk.nextToken())-1,Integer.parseInt(tk.nextToken())-1);
        tk = new StringTokenizer(br.readLine());
        node end = new node(Integer.parseInt(tk.nextToken())-1,Integer.parseInt(tk.nextToken())-1);
        System.out.println(bfs(start,end));
    }
}
