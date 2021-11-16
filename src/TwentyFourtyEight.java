import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
public class TwentyFourtyEight {
    //NOTE: only 1/2 test cases AC.
    public static void main(String[] args) throws IOException{
        boolean complete;
        ArrayList<Integer>board = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int k=0;k<5;k++){
            board.clear();
            for(int i=0;i<4;i++){
                String input = br.readLine();
                StringTokenizer tk = new StringTokenizer(input);
                for (int j=0;j<4;j++) {
                    board.add(Integer.parseInt(tk.nextToken()));
                }
            }
            while(true){
                complete = true;
                for(int i=0;i<16;i++){
                    for(int j=0;j<16;j++){
                        if(board.get(i)!=0&&i!=j){
                            if(board.get(i).equals(board.get(j))){
                                board.set(i,board.get(i)+board.get(j));
                                board.set(j,0);
                                complete = false;
                            }
                        }
                    }
                }
                if(complete==true){
                    break;
                }
            }
            System.out.println(Collections.max(board));
        }
    }
}
