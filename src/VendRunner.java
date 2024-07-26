public class VendRunner {
    public static void main(String[] args){
            try {
                    //Snack instance
                    Snack snack1 = new Snack("PopCorn", 3, true);
                    System.out.println("---SNACK---");
                    System.out.println(snack1);

                    Snack snack2 = new Snack("Snack 2", -4, true);
                    System.out.println("---SNACK---");
                    System.out.println(snack2);

                    //Beverage instance
                    Beverage beverage1 = new Beverage("Fanta", 1.09, 16.8);
                    System.out.println("---Beverage---");
                    System.out.println(beverage1);
                    Beverage beverage2 = new Beverage("Fanta", 1.09, -60);
                    System.out.println("---Beverage---");
                    System.out.println(beverage2);

                    //Slot instance
                    Slot<Snack> slot1 = new Slot<>(snack1, 4);
                    System.out.println("---Slot1---");
                    System.out.println(slot1);

                    Slot<Beverage> slot2 = new Slot<>(beverage1, 3);
                    System.out.println("---Slot2---");
                    System.out.println(slot2);

                    //Vending Machine Instance
                    VendingMachine vendingMachine = new VendingMachine();

                    //Add Products to Vending Machine
                    vendingMachine.addProduct("PopCorn", slot1);
                    vendingMachine.addProduct("Fanta", slot2);

                    System.out.println("---Vending Machine");
                    //Display products
                    vendingMachine.displayProducts();

                    //Dispense products
                    Product dispensedProduct1 = vendingMachine.dispenseProduct("Fanta");
                    Product dispensedProduct2 = vendingMachine.dispenseProduct("PopCorn");
                    Product dispensedProduct3 = vendingMachine.dispenseProduct("Fanta");
                    Product dispensedProduct4 = vendingMachine.dispenseProduct("Fanta");
                    Product dispensedProduct5 = vendingMachine.dispenseProduct("Fanta");

                    System.out.println("---After Dispensing---");
                    vendingMachine.displayProducts();
            }catch(IllegalArgumentException exception)
            {
                    System.out.println("Invalid Inputs :"+exception.getMessage());
            }
    }
}
