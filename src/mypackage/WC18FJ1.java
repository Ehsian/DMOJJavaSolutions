package mypackage;
import java.io.*;
import java.util.*;
public class WC18FJ1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>nums = new ArrayList<>();
        HashSet<Integer>temp = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            nums.add(num);
            temp.add(num);
        }
        ArrayList<Integer>crappysolu = new ArrayList<>(temp);
        int mco = 1;
        int mco2 = 1;
        int commonnum = nums.get(0);
        int commonnum2 = nums.get(0);
        int currentoccurences;
        int currentnum;
        for(int i=0;i<crappysolu.size();i++){
            currentnum = crappysolu.get(i);
            currentoccurences = Collections.frequency(nums,currentnum);
            if(currentoccurences>mco){
                mco=currentoccurences;
                commonnum = currentnum;
            } else if(currentoccurences>mco2){
                mco2=currentoccurences;
                commonnum2 = currentnum;
            }
        }
        int ans = 0;
        for(int num:nums){
            if(num==commonnum||num==commonnum2){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
