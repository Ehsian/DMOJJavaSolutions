import java.util.*;
import java.io.*;
public class DMOPC20C2P5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        StringTokenizer tk = new StringTokenizer(br.readLine());
        ArrayList<Integer>array = new ArrayList<>();
        ArrayList<Integer>subarray = new ArrayList<>();
        for(int i=0;i<N;i++){
            array.add(Integer.parseInt(tk.nextToken()));
        }
        for(int i=0;i<N;i++){
            subarray.clear();
            for(int j=i;j<array.size();j++){
                subarray.add(array.get(j));
                for(int k=0;k<subarray.size();k++){
                    if(Collections.frequency(subarray,k)>subarray.size()/2){
                        ans++;
                    }
                }
            }
        }
        ans+=N;
        System.out.println(ans);
    }
}
