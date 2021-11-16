import java.io.*;
public class DMOPC20C1P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String str = br.readLine();
            if(str.contains("M")&&str.contains("C")){
                System.out.println("NEGATIVE MARKS");
            }
            else if(str.contains("M")||str.contains("C")){
                System.out.println("FAIL");
            }
            else{
                System.out.println("PASS");
            }
        }
    }
}
