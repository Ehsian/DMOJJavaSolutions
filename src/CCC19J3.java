import java.util.*;
import java.io.*;
public class CCC19J3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String str = br.readLine();
            char prev = str.charAt(0);
            int occ = 1;
            for(int j=1;j<str.length();j++){
                if(str.charAt(j)==prev){
                    occ++;
                }
                else{
                    System.out.print(occ + " " + prev + " ");
                    occ = 1;
                    prev = str.charAt(j);
                }
            }
            System.out.println(occ + " " + prev);
        }
    }
}