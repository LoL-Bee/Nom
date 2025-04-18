public class EggBasket {
    public static void main(String[] args){
        int numberOfBaskets, EggsPerBasket, totalEggs;
        numberOfBaskets = 10;
        EggsPerBasket = 6;
        totalEggs = numberOfBaskets*EggsPerBasket;
        System.out.println("if you have");
        System.out.println(EggsPerBasket + " eggs per basket and ");
        System.out.println(numberOfBaskets + " basket, then ");
        System.out.println("the total number of eggs is " + totalEggs);
    }
}