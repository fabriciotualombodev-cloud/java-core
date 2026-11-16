package ejercicios_java;

public class Arrays {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        double[] mediciones_CPU = {12.12, 23.4, 34.34, 40.34, 50.23};
        double total=0, uso_pico=0;
        int hora_pico=0;
        
        System.out.println("---Sistema de Registro de Servidor---");
        for(int i=0;i<mediciones_CPU.length;i++){
            System.out.println("Hora "+(i+1)+": "+mediciones_CPU[i]+" %" );
            total=mediciones_CPU[i]+total;
            if(mediciones_CPU[i]>uso_pico){
                uso_pico = mediciones_CPU[i];
                hora_pico = i+1;
            }
            
        }
        
        System.out.println("Promedio de uso del servidor: "+(total/5));
        System.out.println("Hora pico: "+hora_pico+" Uso: "+uso_pico);
        
    }
    
}
