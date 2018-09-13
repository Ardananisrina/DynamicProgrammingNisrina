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
public class Tugas1 {
    public static void main(String[] args){
        String identitas = "Nisrina Izdihar Ardana Putri / X RPL 5 / 32";
        System.out.println("Identitas : " + identitas);
        
        Scanner baca = new Scanner(System.in);
        System.out.print("Uang yang diinput : ");
        int uang = baca.nextInt();
        
        int pecahan[] = new int[]{5000, 2000, 1000, 500, 200, 100};
        int jumlah;
        
        for(int a = 0; a < pecahan.length; a++){
            if(uang >= pecahan[a]){
                jumlah = uang / pecahan[a];
                uang = uang % pecahan[a];
                System.out.println("Pecahan " +  pecahan[a] + " sebanyak " + jumlah);
            }
        }
    }
    
}
