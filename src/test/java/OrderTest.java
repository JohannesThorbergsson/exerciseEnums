import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OrderTest {

    @Test
    void testEnum() {
        // GIVEN
        Order order = new Order("1", OrderStatus.RECEIVED);

        // WHEN
        OrderStatus expected = OrderStatus.RECEIVED;
        OrderStatus actual = order.getStatus();

        assertEquals(expected, actual);
    }

}