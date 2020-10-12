public class Invoice {
    private String partNumber;
    private String description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String description, int quantity, double pricePerItem){
        this.partNumber = partNumber;
        this.description = description;
        if(quantity > 0){
            this.quantity = quantity;
        }
        if(pricePerItem > 0){
            this.pricePerItem = pricePerItem;
        }
    }

    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public String getPartNumber(){
        return partNumber;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }
    public double getPrice(double x){
            return pricePerItem;
    }

    public double getInvoicAmount(int quantity , double pricePerItem){
        double amount = 0;
        if(quantity > 0){
             amount  = quantity * pricePerItem;
         }
         return amount;
    }
}
