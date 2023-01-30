import java.io.*;
import java.util.*;

public class mwc15c4p3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int Q = Integer.parseInt(tk.nextToken());
        HashMap<Integer,Integer> xmap = new HashMap();
        HashMap<Integer,Integer> ymap = new HashMap();
        ArrayList<String>arr = new ArrayList<>();
        for(int i=0;i<N;i++){
            tk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(tk.nextToken());
            int y = Integer.parseInt(tk.nextToken());
            if(xmap.containsKey(x)){
                xmap.put(x,xmap.get(x)+1);
            }else{
                xmap.put(x,1);
            }
            if(ymap.containsKey(y)){
                ymap.put(y,ymap.get(y)+1);
            }else{
                ymap.put(y,1);
            }
            arr.add(x + ", " + y);
        }
        for(int i=0;i<Q;i++){
            tk = new StringTokenizer(br.readLine());
            int query = Integer.parseInt(tk.nextToken());
            if(query==1){
                int x = Integer.parseInt(tk.nextToken());
                int y = Integer.parseInt(tk.nextToken());
                if(arr.contains(x + ", " + y)){
                    System.out.println("salty");
                }else{
                    System.out.println("bland");
                }
            }
            else{
                String axis = tk.nextToken();
                int coord = Integer.parseInt(tk.nextToken());
                if(axis.equalsIgnoreCase("x")){
                    if(xmap.containsKey(coord)){
                        System.out.println(xmap.get(coord));
                    }
                    else{
                        System.out.println(0);
                    }
                }
                else{
                    if(ymap.containsKey(coord)){
                        System.out.println(ymap.get(coord));
                    }
                    else{
                        System.out.println(0);
                    }
                }
            }
        }
    }
}
