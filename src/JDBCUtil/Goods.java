package JDBCUtil;

public class Goods {

    private int id;
    private String name;
    private int quantity;

    Goods(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public String toString() {
        return "[id=" + id + " name=" + name + " quantity=" + quantity + ']';
    }

}
