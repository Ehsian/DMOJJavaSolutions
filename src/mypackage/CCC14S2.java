package mypackage;
import java.io.*;
import java.util.*;
public class CCC14S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean check = true;
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tk1 = new StringTokenizer(br.readLine());
        StringTokenizer tk2 = new StringTokenizer(br.readLine());
        ArrayList<String>names1 = new ArrayList<>();
        ArrayList<String>names2 = new ArrayList<>();
        for(int i=0;i<N;i++){
            names1.add(tk1.nextToken());
            names2.add(tk2.nextToken());
        }
        for(int i=0;i<N;i++){
            if(!names2.get(i).equals(names1.get(names2.indexOf(names1.get(i))))){
                check = false;
            }
            else if(names1.get(i).equals(names2.get(i))){
                check = false;
            }
        }
        if(check){
            System.out.println("good");
        }
        else{
            System.out.println("bad");
        }
    }
}
