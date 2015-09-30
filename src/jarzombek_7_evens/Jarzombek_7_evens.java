/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarzombek_7_evens;

/**
 *
 * @author josephjarzombek
 */
public class Jarzombek_7_evens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        int counter = 0;
        for(int i = 0; i < 100; i++) {
            if(isPrime(i)) {
               // x = x+1;
            //}
            //if(isOdd(i)) {
               // y = y+1;
            //}
        //}       
            System.out.println(i + " primes");
            //System.out.println(y + " odds");
    
    //}
    /* A method is like a function, a little program. A method is an action 
    you want to frequently repeat
    */
        //static boolean isEven (int somenumber) {
           // return (somenumber % 2 == 0);
        //}  
        //static boolean isOdd (int othernumber) {
            //return (othernumber % 2 != 0);
            }
        }
    }
        static boolean isPrime (int somenumber) {
            int divisor = 0;
            for (int i = 2; i < somenumber; i++) {
                if(somenumber % i != 0){
                    divisor += 1;
                    
                }
            
        }
    return (divisor == 0);
}
}

