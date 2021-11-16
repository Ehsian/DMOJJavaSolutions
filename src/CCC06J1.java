import java.io.*;
public class CCC06J1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int burger = Integer.parseInt(br.readLine());
        int side = Integer.parseInt(br.readLine());
        int drink = Integer.parseInt(br.readLine());
        int dessert = Integer.parseInt(br.readLine());
        int totalcalories = 0;
        switch (burger) {
            case 1 -> totalcalories+=461;
            case 2 -> totalcalories+=431;
            case 3 -> totalcalories+=420;
        }
        switch (side) {
            case 1 -> totalcalories+=100;
            case 2 -> totalcalories+=57;
            case 3 -> totalcalories+=70;
        }
        switch (drink) {
            case 1 -> totalcalories+=130;
            case 2 -> totalcalories+=160;
            case 3 -> totalcalories+=118;
        }
        switch (dessert) {
            case 1 -> totalcalories+=167;
            case 2 -> totalcalories+=266;
            case 3 -> totalcalories+=75;
        }
        System.out.println("Your total Calorie count is "+totalcalories+".");
    }
}
