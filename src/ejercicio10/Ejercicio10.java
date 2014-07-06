/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio10;
import javax.swing.JOptionPane;
/**
 *
 * @author 
 */
public class Ejercicio10 
{
    public static void main(String[] args) 
    {        
        int x,y,S=0;
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número inicial"));
        y=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese otro número numero final"));         
        for (int i = x; i <= y; i++) 
        {
            S=0; 
            for (int j = 1  ; j < i; j++) 
            {
                if ((i % j)==0) 
                {
                    S =S+j;
                }
                if ((i==y)&&((i%j)!=0)) 
                {
                    S=0; 
                }
            }
            if (S==i) 
            {
                JOptionPane.showMessageDialog(null, "El primer número perfecto menor entre "+ x+" y "+y+ " es = " +S);
                i=y;
            }
        }
        if(S==0) 
        {
            JOptionPane.showMessageDialog(null, "No hay números perfectos entre "+ x+" y "+y);
        }    
    }
}