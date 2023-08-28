/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
import Mundo.User;
import Mundo.Transfer1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author USER
 */
public class TransferTest {
    @Test
    public void testVerifyPinTransfer() {
        // Crear una instancia de User para el pinTransfer
        User user = new User("John", "Domingez", "123456789", 123456, 7890, "Cliente1", "9876");
        
        // Crear una instancia de Transfer1 con el pinTransfer
        Transfer1 transfer = new Transfer1(user);
        
        // Verificar si el pinTransfer es el mismo que el PIN de User
        boolean result = transfer.verifyPinTransfer();
        
        // Verificar el resultado esperado usando assertEquals
        assertEquals(true, result);
    }
}
