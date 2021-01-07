package mypackage;
import java.io.*;
import java.util.*;
public class CCC17S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());
        ArrayList<Integer>all = new ArrayList<>();
        ArrayList<Integer>low = new ArrayList<>();
        ArrayList<Integer>high = new ArrayList<>();
        boolean switcher = true;
        for(int i=0;i<N;i++){
            all.add(Integer.parseInt(tk.nextToken()));
        }
        int numlows = (int)Math.ceil((double)N/2);
        int numhighs = N/2;
        Collections.sort(all);
        for(int i=0;i<numlows;i++){
            low.add(all.get(i));
        }
        for(int i=0;i<numhighs;i++){
            high.add(all.get(N-1-i));
        }
        Collections.sort(low,Collections.reverseOrder());
        Collections.sort(high);
        for(int i=0;i<numhighs;i++){
            System.out.print(low.get(i)+" "+high.get(i)+" ");
        }
        if(numlows>numhighs){
            System.out.println(low.get(low.size()-1));
        }
    }
}
