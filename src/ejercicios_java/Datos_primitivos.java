package ejercicios_java;

public class Datos_primitivos {
    public static void main(String[] args) {
        /*int = estándar para numeros enteros
        long = valores grandes (se requiere usa un 'L' al final ej: 10384783430L)
        float (se requiere usar una 'f' al final ej: 5.5f)
        double = el estándar para decimales
        char = (admite tildes, eñes y caracteres de otros idiomas de forma nativa)
        boolean = almacena solo true o false 
        */ 
        //ejercicio: Sistema de telemetría para un coche de carreras 
        int numero_vueltas = 4;
        int id_sesion = 100452;
        int rpm = 11000;
        double tiempo_vuelta = 60.2191;
        float temperatura_motor = 28.23f;
        char sector_actual = 'B';
        boolean estado_traccion = false;
        System.out.println("--------Sistema de Telemetría--------");
        System.out.println("ID: "+id_sesion);
        System.out.println("Sector: "+sector_actual);
        System.out.println("Vueltas completadas: "+numero_vueltas);
        System.out.println("Tiempo de vuelta (segundos): "+tiempo_vuelta);
        System.out.println("Revoluciones por Minuto: "+rpm);
        System.out.println("Temperatura del motor: "+temperatura_motor+" °C");
        System.out.println("Estado de traccion: "+estado_traccion);
        System.out.println("---------------------------------------");
            
    }
}
