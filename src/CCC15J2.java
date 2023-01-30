import java.util.*;
import java.io.*;
public class CCC15J2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int happy = 0;
        int sad = 0;
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i) == ':' && str.charAt(i+1) == '-'){
                if(str.charAt(i+2)==')'){
                    happy++;
                } else if(str.charAt(i+2)=='('){
                    sad++;
                }
            }
        }
        if(happy==0 && sad==0){
            System.out.println("none");
        } else if(happy==sad){
            System.out.println("unsure");
        } else if(happy>sad){
            System.out.println("happy");
        } else{
            System.out.println("sad");
        }
    }
}
