package mypackage;
import java.io.*;
public class CCC05S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String str = br.readLine();
            str = str.replace("-","");
            for(int j=0;j<10;j++){
                if(Character.isDigit(str.charAt(j))){
                    System.out.print(str.charAt(j));
                }
                else if(str.charAt(j)==('A')||str.charAt(j)==('B')||str.charAt(j)==('C')){
                    System.out.print("2");
                }
                else if(str.charAt(j)==('D')||str.charAt(j)==('E')||str.charAt(j)==('F')){
                    System.out.print("3");
                }
                else if(str.charAt(j)==('G')||str.charAt(j)==('H')||str.charAt(j)==('I')){
                    System.out.print("4");
                }
                else if(str.charAt(j)==('J')||str.charAt(j)==('K')||str.charAt(j)==('L')){
                    System.out.print("5");
                }
                else if(str.charAt(j)==('M')||str.charAt(j)==('N')||str.charAt(j)==('O')){
                    System.out.print("6");
                }
                else if(str.charAt(j)==('P')||str.charAt(j)==('Q')||str.charAt(j)==('R')||str.charAt(j)==('S')){
                    System.out.print("7");
                }
                else if(str.charAt(j)==('T')||str.charAt(j)==('U')||str.charAt(j)==('V')){
                    System.out.print("8");
                }
                else if(str.charAt(j)==('W')||str.charAt(j)==('X')||str.charAt(j)==('Y')||str.charAt(j)==('Z')){
                    System.out.print("9");
                }
                if(j==2||j==5){
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}