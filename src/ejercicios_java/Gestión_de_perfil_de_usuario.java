package ejercicios_java;
import java.util.Scanner;

public class Gestión_de_perfil_de_usuario {
    public static void main(String[] args) {
        System.out.println("---Gestión de perfil de usuario---");
        Scanner ingreso = new Scanner(System.in);
        int opcion;
        String nombre="Sin registrar";
        String correo="Sin registrar";
        
        
        do {
        System.out.println("Seleccione la opcion que desea: ");
        System.out.println("1. Crear usuario ");
        System.out.println("2. Visualizar usuario ");
        System.out.println("3. Salir ");
        opcion = ingreso.nextInt();
       
        switch(opcion){
            case 1:
                System.out.println("Ingrese su nombre completo: ");
                ingreso.nextLine();
                nombre = ingreso.nextLine();
                nombre = nombre.toUpperCase();
                System.out.println("Ingrese su correo electrónico: ");
                correo = ingreso.nextLine();
                if(correo.contains("@")){
                    System.out.println("Correo guardado correctamente");
                } else{
                    System.out.println("El correo ingresado no es valido");
                    correo = ".............";
                }
                break;
            
            case 2:
                System.out.println("-------Perfil de usuario--------");
                System.out.println("Nombre: "+nombre);
                System.out.println("Correo: "+correo);
                System.out.println("--------------------------------");
                break;
            
            case 3:
                System.out.println("Gracias por usar el programa. Que tenga un buen día");
                break;
                
            default:
                System.out.println("Ingrese una opcion valida. ");
                break;
              
        }
        
        } while(opcion != 3);
    
 }
    
}
