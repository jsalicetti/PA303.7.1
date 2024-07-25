import java.util.Arrays;

public class problem9 {
    public static void main(String [] args){

        int [] array = {4,2,9,13,1,0};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(minvalue(array));
        System.out.println(maxvalue(array));

    }
    static  int minvalue(int [] array){
        int minval = 0;
        for(int i = 0; i < array.length; i++){

            if(minval > array[i]){
                minval = array [i];
            }
        }return minval;
    }
    static  int maxvalue(int [] array) {
        int maxval = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxval) {
                maxval = array[i];
            }
        }return maxval;
    }
}