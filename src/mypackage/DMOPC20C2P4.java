package mypackage;
import java.util.*;
import java.io.*;
public class DMOPC20C2P4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk1.nextToken());
        int M = Integer.parseInt(tk1.nextToken());
        StringTokenizer tk2 = new StringTokenizer(br.readLine());
        StringTokenizer tk3 = new StringTokenizer(br.readLine());
        ArrayList<Integer>pigeons = new ArrayList<>();
        ArrayList<Integer>worms = new ArrayList<>();
        for(int i=0;i<N;i++){
            pigeons.add(Integer.parseInt(tk2.nextToken()));
        }
        for(int i=0;i<M;i++){
            worms.add(Integer.parseInt(tk3.nextToken()));
        }
        for(int i=0;i<M;i++){
            if(i<N){
                continue;
            }
            for(int j=0;j<i;j++){
                for(int pigeon:pigeons){
                    if(i>pigeons.get(pigeon)){

                    }
                }
            }
        }
    }
}
