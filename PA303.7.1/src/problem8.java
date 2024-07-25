import java.util.Arrays;


public class problem8 {
    public static void main(String [] args){
        String [] array = {"mexico","jump","blue","sleep","drive"};

        String temp = array[0];
        array[0] = array[2];
        array[2] = temp;
        System.out.println(Arrays.toString(array));

    }
}