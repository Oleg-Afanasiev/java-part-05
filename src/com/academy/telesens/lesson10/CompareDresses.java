package com.academy.telesens.lesson10;

import com.academy.telesens.automationpractice.model.EntityDress;

public class CompareDresses {
    public static void main(String[] args) {
        String[] expected = {"demo_1", "demo_3", "demo_4", "demo_5"};
        String[] actual = {"demo_3", "demo_4", "demo_1", "demo_5"};

        EntityDress[] expectedDresses = getExpectedDresses();
        EntityDress[] actualDresses = getActualDresses();
        boolean assertByCode = compare(expected, actual);
        boolean assertByDress = compare(expectedDresses, actualDresses);

        System.out.println(assertByCode);
        System.out.println(assertByDress);
    }

    // TODO
    private static boolean compare(String[] expected, String[] actual) {
        return false;
    }

    // TODO
    private static boolean compare(EntityDress[] expected, EntityDress[] actual) {
        return false;
    }

    private static EntityDress[] getExpectedDresses() {
        return new EntityDress[]{
                new EntityDress()
                        .withModel("demo_1")
                        .withName("Faded Short Sleeve T-shirts")
                        .withColor("Orange")
                        .withSize("S")
                        .withPrice(16.51),

                new EntityDress()
                        .withModel("demo_3")
                        .withName("Printed Dress")
                        .withColor("Orange")
                        .withSize("S")
                        .withPrice(26.00),

                new EntityDress()
                        .withModel("demo_4")
                        .withName("Printed Dress")
                        .withColor("Beige")
                        .withSize("S")
                        .withPrice(50.99),

                new EntityDress()
                        .withModel("demo_5")
                        .withName("Printed Summer Dress")
                        .withColor("Yellow")
                        .withSize("S")
                        .withPrice(28.98),
        };
    }

    private static EntityDress[] getActualDresses() {
        return new EntityDress[]{
                new EntityDress()
                        .withModel("demo_3")
                        .withName("Printed Dress")
                        .withColor("Orange")
                        .withSize("S")
                        .withPrice(26.00),

                new EntityDress()
                        .withModel("demo_4")
                        .withName("Printed Dress")
                        .withColor("Beige")
                        .withSize("S")
                        .withPrice(50.99),

                new EntityDress()
                        .withModel("demo_1")
                        .withName("Faded Short Sleeve T-shirts")
                        .withColor("Orange")
                        .withSize("S")
                        .withPrice(16.51),

                new EntityDress()
                        .withModel("demo_5")
                        .withName("Printed Summer Dress")
                        .withColor("Yellow")
                        .withSize("S")
                        .withPrice(28.98),
        };
    }
}
