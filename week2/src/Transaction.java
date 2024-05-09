import java.time.LocalDateTime;

public class Transaction {
    public enum TransactionStatus {
        CREATED,
        SUCCESS,
        FAILED,
        REFUNDED;
    }
    private int transactionId;
    private int total;
    private TransactionStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public int getTransactionId() {
        return this.transactionId;
    }

    public int getTotal() {
        return this.total;
    }

    public TransactionStatus getStatus() {
        return this.status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }
}
