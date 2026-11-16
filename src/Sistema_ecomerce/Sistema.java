package Sistema_ecomerce;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        Producto Laptop = new Producto("Laptop Lenovo Ideapad Slim 3",600,10);
        Producto Celular = new Producto("Samsung A57",419,5);
        System.out.println("---Tienda Virtual Quito---");
        System.out.println("Productos Disponibles: ");
        System.out.println("1. "+Laptop.getNombre());
        System.out.println("2. "+Celular.getNombre());
        System.out.println("Ingresa el número de tu elección: ");
        int opcion=ingreso.nextInt();
        int cantidadaComprar, nuevoStock;
        cantidadaComprar = nuevoStock = 0;
        switch(opcion){
            case 1:
                System.out.println("Producto seleccionado: "+ Laptop.getNombre());
                System.out.println("Precio: "+Laptop.getPrecio());
                System.out.println("Stock disponible: "+Laptop.getStock());
                System.out.println("Cantidad que desea comprar: ");
                cantidadaComprar = ingreso.nextInt();
                if(cantidadaComprar<=Laptop.getStock()){
                    nuevoStock=Laptop.getStock()-cantidadaComprar;
                    Laptop.setStock(nuevoStock);
                    System.out.println("Compra realizada exitosamente");
                } else{
                    System.out.println("No cuenta con suficinete Stock");
                }
                
                break;
            case 2:
                System.out.println("Producto seleccionado: "+ Celular.getNombre());
                System.out.println("Precio: "+Celular.getPrecio());
                System.out.println("Stock disponible: "+Celular.getStock());
                System.out.println("Cantidad que desea comprar: ");
                cantidadaComprar = ingreso.nextInt();
                if(cantidadaComprar<=Celular.getStock()){
                    nuevoStock=Celular.getStock()-cantidadaComprar;
                    Celular.setStock(nuevoStock);
                    System.out.println("Compra realizada exitosamente");
                } else{
                    System.out.println("No cuenta con suficinete Stock");
                }
                
                break;
            default:
                System.out.println("Opcion no valida. Ingrese de nuevo");
                break;
        }     
    }
    
}
