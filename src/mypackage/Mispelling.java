package mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Mispelling {
    public static void main(String[] args) throws IOException{
        ArrayList<String> ans = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String M = br.readLine();
            int num = Integer.parseInt(M.substring(0,M.indexOf(" ")));
            String str = M.substring(M.indexOf(" ")+1);
            ans.add(str.substring(0,num-1)+(str.substring(num)));
        }
        for(int i=0;i<ans.size();i++){
            System.out.println(i+1+" "+ans.get(i));
        }
    }
}
