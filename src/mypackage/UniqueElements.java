package mypackage;
import java.io.*;
import java.util.HashSet;
public class UniqueElements {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer>set=new HashSet<Integer>();
        for(int i=0;i<N;i++){
            set.add(Integer.parseInt(br.readLine()));
        }
        System.out.println(set.size());
    }
}
