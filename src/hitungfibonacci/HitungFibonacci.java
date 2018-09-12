/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungfibonacci;
import java.util.Scanner;
/**
 *
 * @author Nisrina Izdihar
 */
public class HitungFibonacci {
    private static void tampiljudul(String identitas){
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    public static void main (String[] args){
        String identitas = "Nisrina Izdihar Ardana Putri / X RPL 5 / 32";
        tampiljudul(identitas);
        
        int n = tampilinput();
    }
    private static int tampilinput(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke-: ");
        int n = scanner.nextInt();
        
        return n;
    }   
    }
    

