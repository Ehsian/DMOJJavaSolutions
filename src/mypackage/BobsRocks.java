package mypackage;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class BobsRocks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[]array = new int[N];
        StringTokenizer tk = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            array[i]=Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(array);
        int largest = array[0];
        int largestnum = array[0];
        int current = array[0];
        for(int i=1;i<N;i++){
            if(array[i-1]==array[i]){
                current+=array[i];
            }
            else{
                current=array[i];
            }
            if(current>largest){
                largest = current;
                largestnum = array[i];
            }
        }
        System.out.println(largestnum);
    }
}
