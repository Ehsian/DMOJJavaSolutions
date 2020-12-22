package mypackage;
import java.io.*;
import java.util.StringTokenizer;
public class COCI09C6P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        boolean change;
        int standing = 1;
        int R = Integer.parseInt(tk.nextToken());
        int C = Integer.parseInt(tk.nextToken());
        String[]array = new String[R];
        int[]ans = new int[9];
        for(int i=0;i<R;i++){
            array[i]=br.readLine();
        }
        for(int i=C-2;i>2;i--){ //Very beautiful code, I know.
            change = false;
            for(int j=0;j<R;j++){
                if(array[j].lastIndexOf('1')==i){ans[0]=standing;change = true;}
                else if(array[j].lastIndexOf('2')==i){ans[1]=standing;change = true;}
                else if(array[j].lastIndexOf('3')==i){ans[2]=standing;change = true;}
                else if(array[j].lastIndexOf('4')==i){ans[3]=standing;change = true;}
                else if(array[j].lastIndexOf('5')==i){ans[4]=standing;change = true;}
                else if(array[j].lastIndexOf('6')==i){ans[5]=standing;change = true;}
                else if(array[j].lastIndexOf('7')==i){ans[6]=standing;change = true;}
                else if(array[j].lastIndexOf('8')==i){ans[7]=standing;change = true;}
                else if(array[j].lastIndexOf('9')==i){ans[8]=standing;change = true;}
            }
            if(change){
                standing++;
            }
        }
        for(int num:ans){
            System.out.println(num);
        }
    }
}
