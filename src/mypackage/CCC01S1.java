//Note: This is incorrect at the moment.
package mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC01S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String clubs = str.substring(1,str.indexOf("D"));
        String diamonds = str.substring(str.indexOf("D")+1,str.indexOf("H"));
        String hearts = str.substring(str.indexOf("H")+1,str.indexOf("S"));
        String spades = str.substring(str.indexOf("S")+1);
        System.out.println("Cards Dealt     Points");
        int total=0;
        int num1=0;
        String a = clubs;
        if(a.contains("A")){num1+=4;}
        if(a.contains("K")){num1+=3;}
        if(a.contains("Q")){num1+=2;}
        if(a.contains("J")){num1+=1;}
        if(a.length()==0){num1+=3;}
        if(a.length()==1){num1+=2;}
        if(a.length()==2){num1+=1;}
        System.out.println("Clubs "+clubs+"     "+num1);
        total+=num1;
        a = diamonds;
        num1 = 0;
        if(a.contains("A")){num1+=4;}
        if(a.contains("K")){num1+=3;}
        if(a.contains("Q")){num1+=2;}
        if(a.contains("J")){num1+=1;}
        if(a.length()==0){num1+=3;}
        if(a.length()==1){num1+=2;}
        if(a.length()==2){num1+=1;}
        System.out.println("Diamonds "+diamonds+"     "+num1);
        total+=num1;
        a = hearts;
        num1 = 0;
        if(a.contains("A")){num1+=4;}
        if(a.contains("K")){num1+=3;}
        if(a.contains("Q")){num1+=2;}
        if(a.contains("J")){num1+=1;}
        if(a.length()==0){num1+=3;}
        if(a.length()==1){num1+=2;}
        if(a.length()==2){num1+=1;}
        System.out.println("Hearts "+hearts+"     "+num1);
        total+=num1;
        a = spades;
        num1 = 0;
        if(a.contains("A")){num1+=4;}
        if(a.contains("K")){num1+=3;}
        if(a.contains("Q")){num1+=2;}
        if(a.contains("J")){num1+=1;}
        if(a.length()==0){num1+=3;}
        if(a.length()==1){num1+=2;}
        if(a.length()==2){num1+=1;}
        System.out.println("Spades "+spades+"     "+num1);
        total+=num1;
        System.out.println("Total "+total);
    }
}
