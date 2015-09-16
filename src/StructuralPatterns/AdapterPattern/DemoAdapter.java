package StructuralPatterns.AdapterPattern;

/**
 * Created by Olha_Yeremenko on 15.09.2015.
 */
public class DemoAdapter {
    public static void main(String[] args) {
        ColourPrinter colourPrinter= new ColourPrinter();
        colourPrinter.makePrint("A3","diploma.docx");
        colourPrinter.makePrint("A5","myFoto.img");
        colourPrinter.makePrint("A1","poster.img");
    }
}
