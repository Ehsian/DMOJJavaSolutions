package mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Earth {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer bouldercoord = new StringTokenizer(br.readLine());
        StringTokenizer wallcoord = new StringTokenizer(br.readLine());
        int xboulder = Integer.parseInt(bouldercoord.nextToken());
        int yboulder = Integer.parseInt(bouldercoord.nextToken());
        int x1 = Integer.parseInt(wallcoord.nextToken());
        int y1 = Integer.parseInt(wallcoord.nextToken());
        int x2 = Integer.parseInt(wallcoord.nextToken());
        int y2 = Integer.parseInt(wallcoord.nextToken());
        if(x1<xboulder&&xboulder<x2&&y1<yboulder&&yboulder<y2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
