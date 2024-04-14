package Enums;

/**
 * So we can use default or even parametrized constructors with enum class
 * objects like say
 * MacBook(2000),ThinkPad(1800),FlipPad(22000);
 * 
 * We can also use various getter and setter to get values of these instance
 * variables for this various
 * named object like MacBook inside enum class.
 */

enum Laptops {
    MacBook(2000),
    ThinkPad(1800),
    FlipPad(22000);

    private int price;

    private Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

}

public class AdvancedEnumClasses {
    public static void main(String[] args) {
        Laptops lap = Laptops.MacBook;
        System.out.println(lap.getPrice());

        for (Laptops laps : Laptops.values()) {
            System.out.println(laps.getPrice());
        }
    }

}
