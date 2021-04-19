package mypackage;
import java.io.*;
import java.util.*;
public class VMSS7WC16C3P2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());
        int start = Integer.parseInt(tk.nextToken());
        int end = Integer.parseInt(tk.nextToken());
        boolean completed = false;
        boolean[][]arr = new boolean[N][N];
        for(int i=0;i<M;i++){
            tk = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(tk.nextToken());
            int num2 = Integer.parseInt(tk.nextToken());
            arr[num1-1][num2-1] = true;
            arr[num2-1][num1-1] = true;
        }
        HashSet<Integer>visited = new HashSet<>();
        Stack<Integer>stack = new Stack<>();
        stack.push(start);
        while(!stack.isEmpty()){
            int currenthouse = stack.pop();
            if(currenthouse == end){
                System.out.println("GO SHAHIR!");
                completed = true;
                break;
            }
            if(!visited.contains(currenthouse)){
                visited.add(currenthouse);
                for(int i=0;i<N;i++){
                    if(arr[currenthouse-1][i]){
                        stack.push(i+1);
                    }
                }
            }
        }
        if(!completed){
            System.out.println("NO SHAHIR!");
        }
    }
}
