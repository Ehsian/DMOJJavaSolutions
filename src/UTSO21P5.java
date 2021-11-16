import java.io.*;
import java.util.*;
public class UTSO21P5 { //Only attempting this problem for partial points.
    public static void main(String[] args) throws IOException{
        ArrayList<Integer>salaries = new ArrayList<>();
        ArrayList<Integer>revenues = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int Q = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            salaries.add(Integer.parseInt(tk.nextToken()));
            revenues.add(0);
        }
        for(int i=0;i<Q;i++){
            tk = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(tk.nextToken());
            int l = Integer.parseInt(tk.nextToken());
            int r = Integer.parseInt(tk.nextToken());
            if(num==1){
                int change = Integer.parseInt(tk.nextToken());
                for(int j=l-1;j<r;j++){
                    salaries.set(j,salaries.get(j)+change);
                }
            }else{
                for(int j=l-1;j<r;j++){
                    revenues.set(j,revenues.get(j)+salaries.get(j));
                }
            }
        }
        for(int person : revenues){
            System.out.print(person+" ");
        }
        /*
        int[]array = new int[N]; //Salaries
        int[]revenue = new int[N];
        tk = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            array[i] = Integer.parseInt(tk.nextToken());
        }
        for(int i=0;i<Q;i++){
            tk = new StringTokenizer(br.readLine());
            int choice = Integer.parseInt(tk.nextToken());
            int l = Integer.parseInt(tk.nextToken())-1;
            int r = Integer.parseInt(tk.nextToken());
            if(choice==1){
                int raise = Integer.parseInt(tk.nextToken());
                for(int j=l;j<r;j++){
                    array[j]+=raise;
                }
            }
            else if(choice==2){
                for(int j=l;j<r;j++){
                    revenue[j]+=array[j];
                }
            }
        }
        for(int num : revenue){
            System.out.print(num+" ");
        }
         */
    }
}
