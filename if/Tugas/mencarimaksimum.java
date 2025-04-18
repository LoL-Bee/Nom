public class mencarimaksimum{
    public static void main (String[] args){
        int[] array = {3,1,2,6,7,8,5,4};
        
        int maksimum = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > maksimum){
                maksimum = array[i];
            }
        }
        System.out.println("Maksimum dari array adalah: " + maksimum);
    }
}