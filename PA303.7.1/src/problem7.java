public class problem7 {
    public static void main(String [] args){

        int [] array = new int[5];


        for(int i = 0; i < array.length; i++){
            if(i == 2){
                continue;
            }
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }

}