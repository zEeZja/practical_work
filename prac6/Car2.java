package prac6;

class Car2 implements Priceable {
    private double price;

    public Car2(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

