public class Main {
    public static OrderStatus main(Order order) {
        return switch (order.status) {
            case RECEIVED -> OrderStatus.RECEIVED;
            case IN_PROGRESS -> OrderStatus.IN_PROGRESS;
            case IN_DELIVERY -> OrderStatus.IN_DELIVERY;
            case COMPLETED -> OrderStatus.COMPLETED;
            case CANCELLED -> OrderStatus.CANCELLED;
        };
    }
}
