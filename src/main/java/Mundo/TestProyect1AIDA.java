/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Mundo;

/**
 *
 * @author USER
 */
public class TestProyect1AIDA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         // Crear instancias de User
        User user1 = new User("John", "Doe", "123456789", 123456, 7890, "record", "customerID1");
        User user2 = new User("Jane", "Smith", "987654321", 654321, 4321, "record", "customerID2");

        // Crear una instancia de Transfer1 con el primer usuario como pinTransfer
        Transfer1 transfer = new Transfer1(user1);

        // Verificar si el pinTransfer es el mismo que el PIN de User
        boolean result = transfer.verifyPinTransfer();

        // Imprimir el resultado de la verificación
        if (result) {
            System.out.println("El PIN de pinTransfer es el mismo que el PIN de User.");
        } else {
            System.out.println("El PIN de pinTransfer no es el mismo que el PIN de User.");
        }

        // Actualizar el pinTransfer con el segundo usuario
        transfer.setPinTransfer(user2);

        // Verificar nuevamente si el pinTransfer es el mismo que el PIN de User
        result = transfer.verifyPinTransfer();

        // Imprimir el resultado de la verificación
        if (result) {
            System.out.println("El PIN de pinTransfer es el mismo que el PIN de User.");
        } else {
            System.out.println("El PIN de pinTransfer no es el mismo que el PIN de User.");
        }

	
    }
}
