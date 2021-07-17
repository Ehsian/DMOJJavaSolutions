import java.io.*;
import java.util.ArrayList;
public class CCC00S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>array = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            array.add(Integer.parseInt(br.readLine()));
        }
        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num==77){
                break;
            }
            else if(num==88){
                int join = Integer.parseInt(br.readLine());
                array.set(join-1,array.get(join-1)+array.get(join));
                array.remove(join);
            }
            else if(num==99){
                int split = Integer.parseInt(br.readLine());
                int percentage = Integer.parseInt(br.readLine());
                array.add(split,0);
                array.set(split,(int)Math.round((double)array.get(split-1)*(100-percentage)/100));
                array.set(split-1,(int)Math.round((double)array.get(split-1)*percentage/100));
            }
        }
        for(Integer num:array){
            System.out.print(num+" ");
        }
    }
}
