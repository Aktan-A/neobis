import java.time.LocalDateTime;

public class OrderProduct {
    private int orderProductId;
    private int orderId;
    private int productId;
    private int qty;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public int getOrderProductId() {
        return this.orderProductId;
    }

    public int getOrderId() {
        return this.orderId;
    }

    public int getProductId() {
        return this.productId;
    }

    private int getQty() {
        return this.qty;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }
}
