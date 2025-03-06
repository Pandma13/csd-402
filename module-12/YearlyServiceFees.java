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


public class YearlyServiceFees {
    static double serviceFee = 99.00;

    public static double yearlyService() {
        double yearlyServiceFee = serviceFee;

        return yearlyServiceFee;
    }

    public static double yearlyService(double oilChange) {
        double oilChangeFee = oilChange;

        double yearlyServiceFee = serviceFee + oilChangeFee;

        return yearlyServiceFee;
    }

    public static double yearlyService(double oilChange, double tireRotation) {
        double oilChangeFee = oilChange;
        double tireRotationFee = tireRotation;

        double yearlyServiceFee = serviceFee + oilChangeFee + tireRotationFee;

        return yearlyServiceFee;
    }

    public static double yearlyService(double oilChange, double tireRotation, double coupon) {
        double oilChangeFee = oilChange;
        double tireRotationFee = tireRotation;
        double couponDiscount = coupon;

        double yearlyServiceFee = serviceFee + oilChangeFee + tireRotationFee;
        double discountedYearlyServiceFee = yearlyServiceFee - couponDiscount;

        return discountedYearlyServiceFee;
    }

}