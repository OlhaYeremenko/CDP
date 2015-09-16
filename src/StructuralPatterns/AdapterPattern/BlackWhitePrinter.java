package StructuralPatterns.AdapterPattern;

/**
 * Created by Olha_Yeremenko on 15.09.2015.
 */
public class BlackWhitePrinter implements CoolPrinter {

    @Override
    public void makePolaroidPrint(String fileName) {
    }

    @Override
    public void makeColourPrint(String fileName) {
        System.out.println(String.format("Make Black&White print of %s file", fileName));
    }
}
