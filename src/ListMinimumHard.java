import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class ListMinimumHard {
    //Arrays.sort(Object[]) is O(NlogN) worst case, but Arrays.sort(int[]) is O(N^2) worst case.
    //https://dmoj.ca/tips/#java-sort
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        for(int i=0;i<N;i++){
            arr[i] = (Integer.parseInt(br.readLine()));
        }
        Arrays.sort(arr);
        for(Integer num:arr){
            System.out.println(num);
        }
    }
}