/*
 * Esta clase contine 2 atributos que permitiran construir los metodos
 *para obtener la serie del Fibonacci e indicar si el resultado obtenido
 *es par o impar
 */
package calculofibonacci;

/**
 *
 * @author AndresCH
 */
public class Fibonacci {
    /**
     * Creacion de atributos
     */

    private int calcularNumero;
    private int resultadoNumero;
    /**
     * Creacion de constructor con 1 parametro
     * @param calcular 
     */

    public Fibonacci(int calcular) {
        this.calcularNumero = calcular;
    }

    /**
     * Creacion de los metodos Getters and Setters
     * @return the calcularNumero
     */
    public int getCalcularNumero() {
        return calcularNumero;
    }

    /**
     * @param calcularNumero the calcularNumero to set
     */
    public void setCalcularNumero(int calcularNumero) {
        this.calcularNumero = calcularNumero;
    }

    /**
     * @return the resultadoNumero
     */
    public int getResultadoNumero() {
        return resultadoNumero;
    }

    /**
     * @param resultadoNumero the resultadoNumero to set
     */
    public void setResultadoNumero(int resultadoNumero) {
        this.resultadoNumero = resultadoNumero;
    }
    
    /**
     * Este Metodo permitira imprimir la serie de los numeros segun el calculo Fibonacci del numero ingresado
     */

    public void fibonacciImprimir() {
        System.out.println("................******................");
        System.out.println("Segun el calculo Fibonacci del numero: " + this.calcularNumero + "\n" + "el resultado es:");
        for (int f = 0; f <= this.calcularNumero; f++) {
            System.out.print(this.fibonacciCalculado(f) + " - ");
            this.resultadoNumero = this.fibonacciCalculado(f);
        }
        System.out.println();
        System.out.println("................******................");
    }
    
    /**
     * Metodo para mostrar en pantalla el resultado de la serie fibonacci e indicar si es primo o no.
     */

    public void primoImprimir() {
        if (this.primo(this.resultadoNumero)) {
            System.out.println("El número: " + this.resultadoNumero + " Es primo");
        } else {
            System.out.println("El número: " + this.resultadoNumero + " No es primo");
        }
    }
    
    /**
     * Metodo creado para evaluar las condiciones que identifiquen segun
     * el numero indicado si este es primo o no
     * @param numero
     * @return 
     */

    private boolean primo(int numero) {
        int cuenta = 0;
        boolean primo = false;
        for (int p = 1; p <= numero; p++) {
            if (numero % p == 0) {
                cuenta += 1;
            }
        }
        if (cuenta == 2) {
            primo = true;
        }
        return primo;
    }
    
    /**
     * Metodo creado para evaluar las condiciones segun el numero ingresado
     * y generar la sumatoria recursiva y grabe dichos valoress
     * para mostrarlos en la serie impresa
     * @param resultado
     * @return 
     */

    private int fibonacciCalculado(int resultado) {
        if (resultado == 0) {
            return 0;
        } else if (resultado == 1) {
            return 1;
        } else {
            return this.fibonacciCalculado(resultado - 1) + this.fibonacciCalculado(resultado - 2);
        }
    }

}
