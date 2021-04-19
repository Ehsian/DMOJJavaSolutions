package mypackage;
import java.io.*;
public class CCC16J3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                StringBuilder reverse = new StringBuilder(str.substring(i,j));
                reverse.reverse();
                if(str.substring(i,j).equals(reverse.toString())){
                    if(str.substring(i,j).length()>num){
                        num=str.substring(i,j).length();
                    }
                }
            }
        }
        System.out.println(num);
    }
}
