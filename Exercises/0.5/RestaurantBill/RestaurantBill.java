/*
 * Recipt class
 */
public class RestaurantBill{
    private final double TAX_RATE = 0.0675;
    private double tipPercent;
    private double totalWithTax;
    private double tax;
    private double tip;
    private double totalCharge;
    private int age;
    private double costOfMeal;

    public void setAge(int customerAge){
        age = customerAge;
    }
    public void setTip(double givenTip){
        tipPercent = givenTip;
    }
    public void setCostOfMeal(double mealcharge){ // calculates discount depending on age
        if(age >= 65){
            costOfMeal = 0.9 * mealcharge;
        }
        else{
            costOfMeal = mealcharge;
        }
    }
    public void calculateTax(){ // Calculates the tax and the total with tax
        tax = costOfMeal * TAX_RATE;
        totalWithTax = tax + costOfMeal;
    }
    public void calculateTip(){ // Calculates tip from total with tax
        tip = totalWithTax * (tipPercent/100);
    }
    public void calculateTotal(){ // adds the tip to the total cost
        totalCharge = tip + totalWithTax;
    }
    public void printRecipt(){ // prints the recipt
        if(age >= 65){
            System.out.print("Senior discounted price: $");
            System.out.printf("%.2f", costOfMeal);
        }
        else{
            System.out.print("Meal Cost:               $");
            System.out.printf("%.2f", costOfMeal);
        }
        System.out.println("");
        System.out.print("Tax:                     $");
        System.out.printf("%.2f", tax);
        System.out.println("");
        System.out.print("Total with tax:          $");
        System.out.printf("%.2f", totalWithTax);
        System.out.println("");
        System.out.print("Tip:                     $");
        System.out.printf("%.2f", tip);
        System.out.println("");
        System.out.print("Total:                   $");
        System.out.printf("%.2f", totalCharge);
        System.out.println("");
    }
    public void calculateRecipt(double mealCharge, double setTip, int setAge){ // Calculates all variables and runs the print recipt method
        setAge(setAge);
        setTip(setTip);
        setCostOfMeal(mealCharge);
        calculateTax();
        calculateTip();
        calculateTotal();
        printRecipt();
    }
}