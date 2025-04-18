public class mengurutkan{
    public static void main (String [] args){
        int [] array = {3,1,2,6,7,8,5,4};

        for (int i = 0; i<array.length-1; i++){
            for (int k = 0; k<array.length-1-i; k++){
                if (array[k] > array[k+1]){
                    int temp = array[k];
                    array[k] = array[k+1];
                    array[k+1] = temp;
                }
            }
        }
        for (int nilai : array){
            System.out.print(nilai + " ");
        }
    }

}