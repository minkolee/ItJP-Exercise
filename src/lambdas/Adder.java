package lambdas;

public class Adder {

    private int now = 0;

    private String name = "adder";

    Adder(int now, String name) {
        this.now = now;
        this.name = name;
    }

    public Adder addAnother(Adder adder) {
        return new Adder(this.now + adder.now, this.name);
    }

    @Override
    public String toString() {
        return "Adder{" +
                "now=" + now +
                ", name='" + name + '\'' +
                '}';
    }
}
