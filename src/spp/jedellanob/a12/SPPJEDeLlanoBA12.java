/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jedellanob.a12;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author mac
 */
public class SPPJEDeLlanoBA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicio();
        double l,imc;
        int p;
        p=solPeso();
        l=solEstatura();
        imc= p / Math.pow(l, 2);
        if(imc<18.5){
                JOptionPane.showMessageDialog(null, "Su IMC es de "+imc);
                JOptionPane.showMessageDialog(null,"Consulte un nutriólogo");
        }
        if(imc>=18.5 && imc<=25){
                JOptionPane.showMessageDialog(null, "Su IMC es de "+imc);
                JOptionPane.showMessageDialog(null,"Usted se encuentra sano");
        }
        if(imc>25){
                JOptionPane.showMessageDialog(null, "Su IMC es de "+imc);
                JOptionPane.showMessageDialog(null,"Obes@");
        }
    }
   
    
    public static void inicio(){
        JOptionPane.showMessageDialog(null, "Usted acaba de ingresar a la calculadora de IMC");
    }



    public static int solPeso(){
        JFrame frame = new JFrame();
        int peso=0;
        boolean flag;
        do{        
            try{
                String entrada = JOptionPane.showInputDialog(null, " Peso en kilogramos: ");
                peso =Integer.parseInt(entrada);
                flag=false;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(frame, "Intente de nuevo", " Error ", 
                                        JOptionPane.ERROR_MESSAGE);
                flag=true;
            }
        }while(flag==true);
        return peso;
    }
    
    
    public static double solEstatura(){
        JFrame frame = new JFrame();
        double e=0;
        boolean flag;
        do{        
            try{
                String entrada = JOptionPane.showInputDialog(null, "Estatura en metros: ");
                e =Double.parseDouble(entrada);
                flag=false;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(frame, "Intente de nuevo", " Error ", 
                                        JOptionPane.ERROR_MESSAGE);
        flag=true;
            }
        }while(flag==true);
        return e;
    }
}
