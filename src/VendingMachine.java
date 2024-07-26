import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private Map<String,Slot<? extends Product>> slots;

    public VendingMachine(){
        this.slots = new HashMap<String,Slot<? extends Product>>();
    }

    //To add a Product
    public void addProduct(String code, Slot<?> slot)
    {
        if(code == null || code.isEmpty())
        {
            throw new IllegalArgumentException("Code cannot be null or empty");
        }
        if(slot == null)
        {
            throw new IllegalArgumentException("Slot cannot be null");
        }
        slots.put(code, slot);
    }

    //To dispense product
    public Product dispenseProduct(String code) {
        //Validate Code
        if(code == null || code.isEmpty())
        {
            throw new IllegalArgumentException("Code cannot be null or empty");
        }
        //Check if the code exists
        if(slots.containsKey(code))
        {
            if(slots.get(code).getQuantity() >0){
                slots.get(code).setQuantity(slots.get(code).getQuantity() - 1);
                return slots.get(code).getProduct();
            }else {
                System.out.println("Product Not Available");
            }
        }
        return null;
    }

    //To display product
    public void displayProducts() {
        for (Map.Entry<String, Slot<? extends Product>> entry : slots.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "slots=" + slots +
                '}';
    }
}
