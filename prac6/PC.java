package prac6;

class PC implements Priceable {
    private double price;

    public PC(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
