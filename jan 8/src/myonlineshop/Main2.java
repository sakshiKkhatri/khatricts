package myonlineshop;

public class Main2 extends Inning implements Storm {
   
    public Main2() throws RainedOut, BaseballException {
    }
    
    public Main2(String s) throws Foul, BaseballException {
    }
    
   
    public void rainHard() throws RainedOut {
    }
    
    public void event() {
    }
    
    
    public void atBat() throws PopFoul {
    }
    
    public static void main(String[] args) {
        try {
            Main2 si = new Main2();
            si.atBat();
        } catch (PopFoul e) {
            System.err.println("Pop foul");
        } catch (RainedOut e) {
            System.err.println("Rained out");
        } catch (BaseballException e) {
            System.err.println("Generic baseball exception");
        }
       
        try {
           
            Inning i = new Main();
            i.atBat();
          
        } catch (Strike e) {
            System.err.println("Strike");
        } catch (Foul e) {
            System.err.println("Foul");
        } catch (RainedOut e) {
            System.err.println("Rained out");
        } catch (BaseballException e) {
            System.err.println("Generic baseball exception");
        }
    }
} 