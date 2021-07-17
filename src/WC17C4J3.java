import java.io.*;
import java.util.ArrayList;
public class WC17C4J3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String>S = new ArrayList<>();
        S.add("Mind"); S.add("Power"); S.add("Reality"); S.add("Soul"); S.add("Space"); S.add("Time");
        for(int i=0;i<N;i++){
            S.remove(br.readLine());
        }
        for(String str:S){
            System.out.println(str);
        }
    }
}
