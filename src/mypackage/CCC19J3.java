package mypackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedHashSet;
public class CCC19J3 { //INCORRECT AT THE MOMENT
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>array = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String str = br.readLine();
            array.clear();
            for(int j=0;j<str.length();j++){
                array.add(str.substring(j,j+1));
            }
            LinkedHashSet<String>hash = new LinkedHashSet(array);
            for(String uniqueterms : hash){
                System.out.print(Collections.frequency(array,uniqueterms)+" "+uniqueterms+" ");
            }
            System.out.print("\b");
            System.out.println();
        }
    }
}
