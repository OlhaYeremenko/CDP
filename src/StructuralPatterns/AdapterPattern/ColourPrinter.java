package StructuralPatterns.AdapterPattern;

/**
 * Created by Olha_Yeremenko on 15.09.2015.
 */
public class ColourPrinter implements Printer {
    PrintAdapter printAdapter;



    @Override
    public void makePrint(String format, String fileName) {
      if (format.equalsIgnoreCase("A1")){
          System.out.println(String.format("Make colour print of %s file in A1 format ", fileName));
      }
        else if(format.equalsIgnoreCase("A3")||format.equalsIgnoreCase("A5")){
          printAdapter= new PrintAdapter(format);
          printAdapter.makePrint(format, fileName);
      }
        else {
          System.out.println("Find another printer");
      }
    }
}
