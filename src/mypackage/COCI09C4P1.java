package mypackage;
import java.io.*;
import java.lang.Character;
public class COCI09C4P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }
}
