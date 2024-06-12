public class abstractsample { 

    public static void main(String[] args) {

      computer2 c2 = new computer2();
      c2.access();
      c2.access2();
        
        
    }
    
}

abstract class computer{

    abstract void access2();

    void access() {
        System.out.println("extract");

    }

}

class computer2 extends computer {

    void access2() {
        System.out.println("Hello abstract  method");
    }


}




    
