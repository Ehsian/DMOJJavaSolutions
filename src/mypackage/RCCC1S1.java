package mypackage;
import java.io.*;
import java.util.*;
public class RCCC1S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int C = Integer.parseInt(tk.nextToken());
        int V = Integer.parseInt(tk.nextToken());
        String word = br.readLine();
        int vowels = 0;
        int consonants = 0;
        boolean check = true;
        for(int i=0;i<N;i++){
            switch(word.charAt(i)){
                case 'y':
                    vowels++;
                    consonants++;
                    break;
                case 'a':case 'e': case 'i': case 'o': case 'u':
                    vowels++;
                    consonants=0;
                    break;
                default:
                    consonants++;
                    vowels=0;
                    break;
            }
            if(consonants>C||vowels>V){
                System.out.println("NO");
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("YES");
        }
    }
}
