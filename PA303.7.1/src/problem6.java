import java.util.Arrays;

public class problem6 {
    public static void main(String [] args){

        int [] array = new int [5];

        for(int i = 0; i < array.length; i++){
            array[i] = (i + 1) * 2;
        }
        System.out.println(Arrays.toString(array));
    }
}