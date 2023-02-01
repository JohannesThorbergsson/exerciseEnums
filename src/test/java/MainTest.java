import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testMain(){
        //GIVEN
        Order testOrder = new Order("42", OrderStatus.RECEIVED);
        //WHEN
        OrderStatus actualStatus = Main.main(testOrder);
        //THEN
        Assertions.assertEquals(OrderStatus.RECEIVED, actualStatus);
    }
}
