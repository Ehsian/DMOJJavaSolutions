import java.io.*;
import java.util.*;

public class DMOPC21C4P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        StringTokenizer tk = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            nums.add(Integer.parseInt(tk.nextToken()));
        }
        Collections.sort(nums);
        while(nums.size()>0){
            int smallest = nums.get(0);
            nums.remove(0);
            ArrayList<Integer> temp = new ArrayList<>(nums);
            for(int num:temp){
                if(num%smallest==0){
                    nums.remove((Integer)num);
                }
            }
            ans++;
        }
        System.out.println(ans);
    }
}
