package mypackage;
import java.io.*;
import java.util.Arrays;
public class CCC07J1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[]array = new int[3];
        array[0]=Integer.parseInt(br.readLine());
        array[1]=Integer.parseInt(br.readLine());
        array[2]=Integer.parseInt(br.readLine());
        Arrays.sort(array);
        System.out.println(array[1]);
    }
}
