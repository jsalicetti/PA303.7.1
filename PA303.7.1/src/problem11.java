import java.util.Arrays;
import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        String [] array = new String[num];
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(array));
    }
}