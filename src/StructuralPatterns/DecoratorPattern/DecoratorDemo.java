package StructuralPatterns.DecoratorPattern;

/**
 * Created by Olha_Yeremenko on 16.09.2015.
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        //bouquet only with Camomile
        Flower flower= new Camomile();
        flower.addFlower();

        System.out.println("_______________________________");

        //bouquet with Camomile and Tapes
        flower = new TapeDecorator(flower);
        flower.addFlower();


        System.out.println("_______________________________");

        //bouquet with Camomile and Leaves
        flower = new LeavesDecprator(flower);
        flower.addFlower();

        System.out.println("_______________________________");

        //bouquet with Camomile and Tapes
        flower = new TapeDecorator(flower);
        flower.addFlower();


    }
}
