package LearnDBUtils;

public class Goods {

    private int id;
    private String name;
    private int quantity;

    public Goods() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "[id=" + id + " name=" + name + " quantity=" + quantity + ']';
    }

}
