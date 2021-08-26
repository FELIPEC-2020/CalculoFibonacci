/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculofibonacci;

/**
 *
 * @author AndresCH
 */
public class CalculoFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Se hace creacion de objeto de tipo clase Fibonacci que me permita ejecutar los llamados a los metos
         * y se haga el calculo deacurdo a los metos creados 
         * 
         * */         
        Fibonacci objFibonacci = new Fibonacci(11);
        objFibonacci.fibonacciImprimir();
        objFibonacci.primoImprimir();
    }
    
}
