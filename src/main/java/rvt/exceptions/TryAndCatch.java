package rvt.exceptions;

public class TryAndCatch {
        public static void main(String[] args) {
            try{
                Integer.parseInt("Hello");
            }
            catch (NumberFormatException e){
                System.out.println("Hey, this is unpossible!");
            }


            // try{
            //     Integer.parseInt("1");
            // }
            // catch (NumberFormatException e){
            //     System.out.println("Hey, this is unpossible!");
            // }
            // System.out.println("Ends here!");
    }
}
