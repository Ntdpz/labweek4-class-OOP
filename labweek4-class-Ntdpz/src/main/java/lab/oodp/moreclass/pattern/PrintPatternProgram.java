package lab.oodp.moreclass.pattern;

public class PrintPatternProgram {

    public void start() {
        
        printPatternOne();
        printPatternTwo();
        
    }
    public void printPatternOne() {
        System.out.println("First Pattern");
        //TODO uncomment the lines below
        Pattern top = new Pattern(15, '*');
        
        Pattern sideOfFirstLine = new Pattern(7, '#');
        Pattern sideOfLine = new Pattern(7, '~');      
        Pattern middle = new Pattern(1, '.');       
        System.out.println(top);
        System.out.println(sideOfFirstLine.toString() + middle.toString() + sideOfFirstLine.toString());
        
        for (int i = 0; i < 6; i++) {
            middle.setNumberOfCharacters(middle.getNumberOfCharacters() + 1);
            System.out.println(sideOfLine.toString() + middle.toString() + sideOfLine.toString());
        }
    }
    
    public void printPatternTwo() {
        System.out.println("Second Pattern");
        
        Pattern top = new Pattern(35, '@');
        
        Pattern sideOfFirstLine = new Pattern(13, '=');
        Pattern sideOfLine = new Pattern(6, '&');      
        Pattern middle = new Pattern(6 , '.');       
        System.out.println(top);
        System.out.println(sideOfFirstLine.toString() + middle.toString() +middle.toString()+ sideOfFirstLine.toString());
 
        for (int i = 0; i < 6; i++) {
        	middle.setNumberOfCharacters(middle.getNumberOfCharacters() - 1);
        	sideOfLine.setNumberOfCharacters(sideOfLine.getNumberOfCharacters() +1);
            System.out.println(sideOfLine.toString()+ middle.toString() +middle.toString()+ sideOfLine.toString());
        	
        }


    }

    public static void main(String[] args) {
        PrintPatternProgram ppp = new PrintPatternProgram();
        ppp.start();
    }
}
