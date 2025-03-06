// Megan Wheeler
// 4 March 2025
// Assignment 12

// Follow the directions below:

// 1. Write a program with four methods for calculating the cost of a yearly auto
//     service visit. The methods will be titled yearlyService.
// 2. yearlyService(no parameters) - Will return the standard service charge.
// 3. yearlyService(one parameter) - Will return the standard service charge with
//     an added oil change fee.
// 4. yearlyService(two parameters) - Will return the standard service charge with
//     an added oil change fee and a tire rotation charge.
// 5. yearlyService(three parameters) - Will return the standard service charge with
//     an added oil change fee, a tire rotation charge, along with a coupon amount
//     that will be deducted from the total cost.
// 6. Write a main method that will test each of these methods two times.

// Yearly service fees:
    // Service fee: $99
    // Oil change: $35 - $125
    // Tire rotation: $20 - $100
    // Coupon discount: $25 - $75

public class YearlyServiceFeesTest {
    public static void main(String[]args) {
        YearlyServiceFees.yearlyService();
        System.out.println("The total yearly service charge is $" + YearlyServiceFees.yearlyService() + ".00.");
        
        YearlyServiceFees.yearlyService();
        System.out.println("The total yearly service charge is $" + YearlyServiceFees.yearlyService() + ".00.");

        YearlyServiceFees.yearlyService(45);
        System.out.println("The total yearly service charge is $" + YearlyServiceFees.yearlyService(45) + ".00.");

        YearlyServiceFees.yearlyService(125);
        System.out.println("The total yearly service charge is $" + YearlyServiceFees.yearlyService(125) + ".00.");

        YearlyServiceFees.yearlyService(50, 30);
        System.out.println("The total yearly service charge is $" + YearlyServiceFees.yearlyService(50, 30) + ".00.");

        YearlyServiceFees.yearlyService(100, 75);
        System.out.println("The total yearly service charge is $" + YearlyServiceFees.yearlyService(100, 75) + ".00.");

        YearlyServiceFees.yearlyService(60, 50, 25);
        System.out.println("The total yearly service charge is $" + YearlyServiceFees.yearlyService(60, 50, 25) + ".00.");

        YearlyServiceFees.yearlyService(125, 20, 50);
        System.out.println("The total yearly service charge is $" + YearlyServiceFees.yearlyService(125, 20, 50) + ".00.");
    }
}