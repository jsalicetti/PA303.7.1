public class problem2 {
    public static void main(String [] args){
        int [] narray = {13,5,7,68,2};
        for(int i = 0; i < narray.length; i++){
            if(narray[i] < 8 && narray[i] > 6){
                System.out.print(narray[i]);
            }
        }
    }
}