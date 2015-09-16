package StructuralPatterns.AdapterPattern;

/**
 * Created by Olha_Yeremenko on 15.09.2015.
 */
public class PolaroidPrinter implements CoolPrinter {

    @Override
    public void makePolaroidPrint(String fileName) {
        System.out.println(String.format("Make polaroid print of %s file", fileName));
    }

    @Override
    public void makeColourPrint(String fileName) {

    }
}
