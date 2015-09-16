package StructuralPatterns.DecoratorPattern;

/**
 * Created by Olha_Yeremenko on 16.09.2015.
 */
public class TapeDecorator extends BouquetDecorator {
    public TapeDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public void addFlower() {
        flower.addFlower();
        addTape();

    }
    public void addTape(){
        System.out.println("Add Tape to Bouquet");
    }
}
