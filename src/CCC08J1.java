import java.io.*;

public class CCC08J1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        double BMI = weight/(height*height);
        if(BMI>25){
            System.out.println("Overweight");
        }else if(BMI<18.5){
            System.out.println("Underweight");
        }else{
            System.out.println("Normal weight");
        }
    }
}
