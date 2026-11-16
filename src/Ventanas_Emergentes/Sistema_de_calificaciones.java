package Ventanas_Emergentes;

import javax.swing.JOptionPane;

public class Sistema_de_calificaciones {
    public static void main(String[] args) {
        int opcion;
        int notas_validas=0;
        double promedio;
        double suma_notas=0;
        double nota_alta=0;
        double nota_baja=0;
        boolean esPrimer_nota=true;
        JOptionPane.showMessageDialog(null,"-Sistema de calificaciones- \n Haga clic en Aceptar para continuar.");
        do{
            double nota = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la nota del estudiante (0-10) "));
            
            if(nota>=0 && nota<=10){
                notas_validas++;
                suma_notas=nota+suma_notas; 
                
                if(esPrimer_nota){
                    nota_baja = nota;
                    esPrimer_nota=false;
                } else if(nota < nota_baja){
                    nota_baja= nota;
                }
                
                if(nota>nota_alta){
                    nota_alta=nota; 
                }
                  
            }else {
                JOptionPane.showMessageDialog(null,"La nota ingresada no cumple con el rango de calificación (0-10)");
            }
           
            opcion = JOptionPane.showConfirmDialog(null,"¿Desea ingresar otra nota?","Continuar",JOptionPane.YES_NO_OPTION);
        } while(opcion == JOptionPane.YES_OPTION);
        
        promedio = suma_notas/notas_validas;
        String promedioControlado = String.format("%.2f", promedio);
        
        JOptionPane.showMessageDialog(null, "---Reporte final---\nCantidad de notas ingresadas: "+notas_validas+"\nMaterias Evaluadas: "+notas_validas+"\n"
                + "Calificación mas alta: "+nota_alta+"\nNota mas baja: "+nota_baja+"\nPromedio final: "+promedioControlado+"\n");
                       
        if(promedio>=7){
            JOptionPane.showMessageDialog(null, "Estudiante Aprobado \n Felicidades ");
        } else{
            JOptionPane.showMessageDialog(null, "Estudinate Reprobado");
        }
        
    }
    
}
