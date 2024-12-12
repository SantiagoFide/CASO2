/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2santiago;
import java.util.Scanner;

/**
 *
 * @author compr
 */
public class MenuR {
    

    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
       
        do {
            System.out.println("\nMenú:");
            System.out.println("1 para mostrar habitaciones");
            System.out.println("2 para realizar reserva");
            System.out.println("3 para cancelar reserva");
            System.out.println("4 para buscar habitación");
            System.out.println("0 Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                   // mostrarHabitaciones();
                    break;
                case 2:
                    //realizarReserva();
                    break;
                case 3:
                    //cancelaReserva();
                    break;
                case 4:
                    //buscaHabitacion();
                    break;
                case 0:
                    System.out.println("Finaliza");
                    break;
                default:
                    System.out.println("no existe");
            }
        } while (opcion != 0);
    }

    public MenuR() {
    }
    
    

    
}
