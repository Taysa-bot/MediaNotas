/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.util.Scanner;

/**
 *
 * @author 20181094010025
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] nota=new int[4];
        int media = 0;
        System.out.println("Informe as notas");
        for(int i=0;i<4;i++){
            nota [i]=sc.nextInt();
            media=media+nota[i];
        }
        System.out.println("Média = "+media/4);
    }
    
}
