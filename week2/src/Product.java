import java.time.LocalDateTime;

public class Product {
    private int productId;
    private boolean isActive;
    private String name;
    private String description;
    private int price;  // smallest unit of transaction
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public int getProductId() {
        return this.productId;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean active) {
        this.isActive = active;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

}
