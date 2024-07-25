import java.util.Arrays;

public class problem3 {
    public static void main(String [] args){
        String [] array = {"red", "green","blue","yellow"};
        System.out.println(array.length);
        String [] narray = array.clone();
        System.out.println(Arrays.toString(narray));

    }
}