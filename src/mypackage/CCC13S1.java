package mypackage;
import java.io.*;
import java.util.HashSet;
public class CCC13S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Y = Integer.parseInt(br.readLine());
        HashSet<Character> set = new HashSet<>();
        while(true){
            Y++;
            int digits = 0;
            for(char digit:(""+Y).toCharArray()){
                set.add(digit);
                digits++;
            }
            if(set.size()==digits){
                System.out.println(Y);
                break;
            }
            set.clear();
        }
    }
}
