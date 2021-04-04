/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATHI1;

import java.util.Scanner;

/**
 *
 * @author rafii
 */
public class SEQUENTIAL {
    public static void main(String[] args){
        System.out.println("SEQUENTIAL SEARCH"+"\n");
        int data[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int y = 0;
        System.out.print("isi data adalah: ");
        for(int i = 0; i<data.length; i++){
            Scanner scan = new Scanner(System.in);
            System.out.print("700");
            y = scan.nextInt();
            System.out.println("\n");
            
        }
        for (int i = 0; i<data.length; i++){
            if(y==data[i]){
                System.out.print("Data"+y+"berada pada indeks data ke- "+i);
                break;
            }
        }
        System.out.println("\n");
    }
}