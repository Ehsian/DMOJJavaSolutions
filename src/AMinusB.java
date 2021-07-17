import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AMinusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=0;i<N;i++){
            String M = br.readLine();
            String[] num = M.split(" ");
            ans.add(Integer.parseInt(num[0])-Integer.parseInt(num[1]));
        }
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
