package StructuralPatterns.DecoratorPattern;

/**
 * Created by Olha_Yeremenko on 16.09.2015.
 */
public class LeavesDecprator extends BouquetDecorator {

    public LeavesDecprator(Flower flower) {
        super(flower);
    }


    @Override
    public void addFlower() {
       flower.addFlower();
        addLeaves();

    }
public void addLeaves(){
    System.out.println("Add Leaves to Bouquet");
}

}
