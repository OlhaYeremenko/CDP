package StructuralPatterns.AdapterPattern;

/**
 * Created by Olha_Yeremenko on 15.09.2015.
 */
public class PrintAdapter implements Printer {
    CoolPrinter printer;
    public PrintAdapter(String format) {
        if(format.equalsIgnoreCase("A3")){
            printer= new BlackWhitePrinter();
        }
        else if (format.equalsIgnoreCase("A5")) {
            printer= new PolaroidPrinter();
        }

      }

    @Override
    public void makePrint(String format, String fileName) {
        if(format.equalsIgnoreCase("A3")){
            printer.makeColourPrint(fileName);
        }
        else if (format.equalsIgnoreCase("A5")) {
            printer.makePolaroidPrint(fileName);
        }
    }
}
