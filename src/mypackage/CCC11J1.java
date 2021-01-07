package mypackage;
import java.io.*;

public class CCC11J1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int antennae = Integer.parseInt(br.readLine());
        int eyes = Integer.parseInt(br.readLine());
        if(antennae>=3&&eyes<=4){
            System.out.println("TroyMartian");
        }
        if(antennae<=6&&eyes>=2){
            System.out.println("VladSaturnian");
        }
        if(antennae<=2&&eyes<=3){
            System.out.println("GraemeMercurian");
        }
    }
}
