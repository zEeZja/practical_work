package prac3;

public class CurrencyConverter {
    private double rubles;
    private final double eurosPerRuble;
    private final double dollarsPerRuble;

    public CurrencyConverter(double eurosPerRuble, double dollarsPerRuble) {
        this.eurosPerRuble = eurosPerRuble;
        this.dollarsPerRuble = dollarsPerRuble;
    }

    public void setRubles(double rubles) {
        this.rubles = rubles;
    }

    public double convertToEuros() {
        if (rubles < 0) {
            System.out.println("Не верный ввод.");
            return -1;
        }
        return rubles * eurosPerRuble;
    }

    public double convertToDollars() {
        if (rubles < 0) {
            System.out.println("Не верный ввод.");
            return -1;
        }
        return rubles * dollarsPerRuble;
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(0.012, 0.014); // Установите актуальные курсы обмена

        converter.setRubles(1000); // Установите сумму в рублях для конвертации

        double euros = converter.convertToEuros();
        double dollars = converter.convertToDollars();

        System.out.println("1000 рублей равны " + euros + " евро");
        System.out.println("1000 рублей равны " + dollars + " долларов");
    }
}