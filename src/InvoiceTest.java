import javax.swing.JOptionPane;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice first = new Invoice("Nine","Hammer",6, 15.32);
        Invoice second = new Invoice("Six","Brush",12, 6.70);
        Invoice third = new Invoice("Seven", "Welding Machine",-2,-6.35);
        Invoice add = new Invoice("","",-1,-0.25);

        String welcome = String.format("Welcome to the Masaga hardware ");
        JOptionPane.showMessageDialog(null,welcome);

        JOptionPane.showMessageDialog(null,"Things available now are: \n" + first.getPartNumber()+ " "+ first.getDescription()+ "\n"
         + second.getPartNumber()+ " "+ second.getDescription()+ "\n "
         + third.getPartNumber()+ " "+ third.getDescription());

        int choice = Integer.parseInt(JOptionPane.showInputDialog("Which invoice do you want to see: \n1. Hammer\n2. Brush\n3. Machine\n4. Add More inventory"));

        switch (choice){
            case 1 : double amount = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price for the " + first.getDescription()));
                JOptionPane.showMessageDialog(null,"The invoice for "+ first.getDescription() + " is " + first.getInvoicAmount(first.getQuantity(), first.getPrice(amount)));break;
            case 2 :  amount = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price for the " + first.getDescription()));
                JOptionPane.showMessageDialog(null,"The invoice for "+ second.getDescription() + " is " + second.getInvoicAmount(second.getQuantity(), second.getPrice(amount)));break;
            case 3 :  amount = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price for the " + first.getDescription()));
                JOptionPane.showMessageDialog(null,"The invoice for "+ third.getDescription() + " is "+ third.getInvoicAmount(third.getQuantity(), third.getPrice(amount)));break;

            case 4 : String all = JOptionPane.showInputDialog("Enter the part number of the item that you want to add: ");
                    add.setPartNumber(all);

                    all = JOptionPane.showInputDialog("Enter the description of the item that you want to add: ");
                     add.setDescription(all);

                    int allQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of the item that you want to add: "));
                    add.setQuantity(allQuantity);

                    double allPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the item that you want to add: "));
                    add.setPricePerItem(allPrice);break;
        }
        JOptionPane.showMessageDialog(null,"Things available now are: \n" + first.getPartNumber()+ " "+ first.getDescription()+ "\n"
                + second.getPartNumber()+ " "+ second.getDescription()+ " \n"
                + third.getPartNumber()+ " "+ third.getDescription() + "\n" + add.getPartNumber() + " "+ add.getDescription());
    }
}
