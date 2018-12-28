package ijp.chapter9;

public class testStock {
    public static void main(String[] args) {

        Stock s1 = new Stock("ORCL", "Oracle corporation", 34.5, 34.35);
        System.out.printf("The %s has changed %.2f%%", s1.name, s1.getChangePercent());
    }
}

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    double getChangePercent() {
        return (currentPrice - previousClosingPrice) / (previousClosingPrice - 1.0) * 100;
    }
}