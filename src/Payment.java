public class Payment {
     private String customerName;
     private String upiId;
     private double amount;

     public Payment(String customerName, String upiId, double amount){
         setCustomerName(customerName);
         setUpiId(upiId);
         setAmount(amount);
     }

        public String getCustomerName(){
         return customerName;
        }

        public void setCustomerName(String customerName){
         if(customerName == null || customerName.isBlank()){
             System.out.println("Customer Name cannot be empty");
             return;
            }
         this.customerName = customerName;
        }

    public String getUpiId(){
        return upiId;
    }

    public void setUpiId(String upiId){
        if(upiId == null || upiId.isBlank()){
            System.out.println("UPI ID cannot be empty");
            return;
        }
        this.upiId = upiId;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        if(amount <= 0){
            System.out.println("Amount must be greater than zero.");
            return;
        }
        this.amount = amount;
    }



     void processPayment(){
         System.out.println("\n Processing Payment...");
         System.out.println("Payment Successful");
     }

     void displayPaymentDetails(){
         System.out.println("\n ============ PAYMENT DETAILS ============");
         System.out.println("Customer Name:" + customerName);
         System.out.println("UPI ID:" + upiId);
         System.out.println("Amount:" + amount);
         System.out.println("\n ==========================================");
     }
}
