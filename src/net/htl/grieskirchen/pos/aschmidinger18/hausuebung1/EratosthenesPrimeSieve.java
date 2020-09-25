/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htl.grieskirchen.pos.aschmidinger18.hausuebung1;

import java.util.Scanner;

/**
 *
 * @author annas
 */
public class EratosthenesPrimeSieve implements PrimeSieve{

    static boolean[] primes = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        System.out.println("Obergrenze:");
        int auswahl = Integer.parseInt(scanner.nextLine());
        
        EratosthenesPrimeSieve ep = new EratosthenesPrimeSieve(auswahl);
        
    }

    public EratosthenesPrimeSieve(int grenze) {
        primes = new boolean[grenze];
    }

    @Override
    public boolean isPrime(int p) {
        int factors = 0;
        int j = 1;

        while(j <= p)
        {
            if(p % j == 0)
            {
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }
       
    }
    
    
}
