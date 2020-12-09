package mypackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CCC01S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        int nums = end-start+1;
        int columns = 1;
        int rows = 1;
        int num=0;
        for(int i=1;;i++) {
            num+=i;
            if(nums>num) {
                rows++;
            }
            else {
                break;
            }
            num+=i;
            if(nums>num) {
                columns++;
            }
            else {
                break;
            }
        }
        int[][]arr = new int[rows][columns];
        int x = (int)Math.ceil((double)rows/2)-1;
        int y = (int)Math.ceil((double)columns/2)-1;
        num = 0;
        arr[x][y]=start;
        for(int i=start;i<end;){
            num++;
            for(int j=1;j<=num&&i<end;j++){
                x++;
                i++;
                arr[x][y]=i;
            }
            for(int j=1;j<=num&&i<end;j++){
                y++;
                i++;
                arr[x][y]=i;
            }
            num++;
            for(int j=1;j<=num&&i<end;j++){
                x--;
                i++;
                arr[x][y]=i;
            }
            for(int j=1;j<=num&&i<end;j++){
                y--;
                i++;
                arr[x][y]=i;
            }
        }
        for(int i=0;i<rows;i++) {
            for (int j=0;j<columns;j++) {
                if (arr[i][j] == 0) {
                    System.out.print("   ");
                } else if (arr[i][j] < 10) {
                    System.out.print(" " + arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
