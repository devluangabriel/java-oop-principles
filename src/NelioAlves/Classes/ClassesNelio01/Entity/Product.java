package NelioAlves.Classes.ClassesNelio01.Entity;

public class Product {
    public String name;
    public Double price;
    public Integer quantity;

    public Double TotalValueinStock() {
        return price * quantity;
    }

    public void AddProducts(Integer quantity) {
        this.quantity += quantity;
    }

    public void RemoveProducts(Integer quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name;
    }
}
