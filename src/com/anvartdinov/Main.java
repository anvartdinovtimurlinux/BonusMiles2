package com.anvartdinov;

public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);

        System.out.println("Купив билет стоимостью " + price + "р.");
        System.out.println("Вы получите " + miles + " бонусных миль.");
    }

}
