package StructuralPatterns.DecoratorPattern;

/**
 * Created by Olha_Yeremenko on 16.09.2015.
 */
public abstract class BouquetDecorator implements Flower {
    Flower flower;

    public BouquetDecorator(Flower flower) {
       this.flower=flower;
    }
}
