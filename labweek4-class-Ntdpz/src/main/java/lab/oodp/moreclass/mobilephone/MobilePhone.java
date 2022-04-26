package lab.oodp.moreclass.mobilephone;

public class MobilePhone {

 //TODO: delcare instance variables here
  private String brandPhone;
  private String modelPhone;
  private double pricePhone;
   
     public MobilePhone(String brand, String model, double price) {
         //TODO: complete this constructor
      brandPhone = brand;
      modelPhone = model;
      pricePhone = price;
     }

     public boolean isCheaperThan(MobilePhone other) {
         //TODO: complete this method to compare price
      for(int i = 0 ;i<3;i++) {
       if(this.pricePhone<pricePhone) {
        return true;
       }
      }
      return false;
     }

     @Override
     public String toString() {
      //TODO: complete this method to print out mobile phone info.
      
         return this.brandPhone+" "+this.modelPhone+" which cost $"+this.pricePhone;
     }

     @Override
     public boolean equals(Object obj) {
        //TODO: complete this method to compare mobile phone object
      if(obj instanceof MobilePhone) {
        MobilePhone objA =(MobilePhone) obj;
       return this.brandPhone.equals(objA.brandPhone)
         && this.modelPhone.equals(objA.modelPhone)
         && this.pricePhone == objA.pricePhone;       
      }
         return false;
     }
     
     //Price
     public double getPrice() {
      return pricePhone;
     }
     public void setPrice(double price) {
      this.pricePhone = price;
     }
     
     //Model
     public String getModel() {
      return modelPhone;
     } 
     public void setModel(String model) {
      this.modelPhone = model;
     }
     
     //Brand
     public String getBrand() {
      return brandPhone;
     }
     public void setBrand(String brand) {
      this.brandPhone = brand;
     }
}