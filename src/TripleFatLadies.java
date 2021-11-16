import java.io.*;

public class TripleFatLadies {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            int k = Integer.parseInt(br.readLine());
            for(int j=192;;j+=250){ //Found after testing and getting TLE
                if(j>k){
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
