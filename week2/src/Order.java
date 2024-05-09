import java.time.LocalDateTime;

public class Order {
    public enum OrderStatus {
        CREATED,
        SHIPPED,
        COMPLETED,
        CANCELLED;
    }

    private int orderId;
    private int customerId;
    private int transactionId;
    private OrderStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public int getOrderId() {
        return this.orderId;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public int getTransactionId() {
        return this.transactionId;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

}
