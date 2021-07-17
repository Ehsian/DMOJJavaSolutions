import java.io.*;
public class CCC11S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int T = 0;
        int S = 0;
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            str=br.readLine();
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='t'||str.charAt(j)=='T'){
                    T++;
                }
                else if(str.charAt(j)=='s'||str.charAt(j)=='S'){
                    S++;
                }
            }
        }
        if(T>S){
            System.out.println("English");
        }
        else{
            System.out.println("French");
        }
    }
}
