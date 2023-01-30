import java.util.*;
import java.io.*;
public class AAC4P1 {
    public static void main(String[] args) throws IOException{ //TLE
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());
        String X = br.readLine();
        ArrayList<String>chars = new ArrayList<>();
        for(int i=0;i<N;i++){
            chars.add(X.substring(i,i+1));
        }
        tk = new StringTokenizer(br.readLine());
        ArrayList<Integer>cheerValues = new ArrayList<>();
        for(int i=0;i<M;i++){
            cheerValues.add(Integer.parseInt(tk.nextToken()));
        }
        for(int i=0;i<chars.size();i++){
            if(!chars.get(i).equals("0")){
                String str = chars.get(i);
                chars.remove(i--);
                chars.add(str);
            }
            else{
                cheerValues.set(0,cheerValues.get(0)-1);
                if(cheerValues.get(0)==0){
                    chars.remove(i--);
                    cheerValues.remove(0);
                }
                else{
                    int value = cheerValues.get(0);
                    cheerValues.remove(0);
                    cheerValues.add(value);
                    chars.remove(i--);
                    chars.add("0");
                }
            }
            if(!chars.contains("0")){
                break;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (String c : chars) {
            ans.append(c);
        }
        System.out.println(ans);
    }
}
