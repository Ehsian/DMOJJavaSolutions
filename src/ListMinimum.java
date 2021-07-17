import java.io.*;
import java.util.Arrays;
public class ListMinimum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[]nums = new int[Integer.parseInt(br.readLine())];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
