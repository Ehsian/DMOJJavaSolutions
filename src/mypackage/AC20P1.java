package mypackage;
import java.io.*;
import java.util.*;
public class AC20P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            tk = new StringTokenizer(br.readLine());
            double num1 = Integer.parseInt(tk.nextToken());
            double num2 = Integer.parseInt(tk.nextToken());
            double num3 = Integer.parseInt(tk.nextToken());
            double angle1 = Math.acos((Math.pow(num2,2)+Math.pow(num3,2)-Math.pow(num1,2))/(2*num2*num3));
            double angle2 = Math.acos((Math.pow(num1,2)+Math.pow(num3,2)-Math.pow(num2,2))/(2*num1*num3));
            double angle3 = Math.acos((Math.pow(num2,2)+Math.pow(num1,2)-Math.pow(num3,2))/(2*num2*num1));
            if(Math.max(Math.max(angle1,angle2),angle3)==Math.PI/2){
                System.out.println("R");
            } else if(Math.max(Math.max(angle1,angle2),angle3)>Math.PI/2){
                System.out.println("O");
            } else{
                System.out.println("A");
            }
        }
    }
}
