// Megan Wheeler
// 23 February 2025
// Assignment 9

// Complete the following:

// 1. Create an abstract Division class with fields for a company's division name and 
//     account number, and an abstract display () method that will be defined in the
//     subclasses.
// 2. Use a constructor in the superclass that requires values for both fields.
// 3. Create two subclasses named InternationalDivision and DomesticDivision.
// 4. The InternationalDivision class includes a field for the country in which the
//     division is located, a field for the language spoken, and a constructor that 
//     requires all fields when created.
// 5. The DomesticDivision class includes a field for the state in which the division is 
//     located and a constructor that requires all fields when created. 
// 6. Write an application named UseDivision that creates two instances of each of these
//     concrete classes (4 total instances).
// 7. Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.


public class UseDivision {

    public static void main(String[] args){
        // create instances of DomesticDivision class and assign variables
        DomesticDivision div1 = new DomesticDivision("South West", "SW-8724", "Nevada");
        DomesticDivision div2 = new DomesticDivision("East Coast", "EC-5421", "Rhode Island");

        // create instances of InternationalDivision class and assign variables
        InternationalDivision div3 = new InternationalDivision("Europe", "IE-4297", "Denmark", "Danish");
        InternationalDivision div4 = new InternationalDivision("Asia", "IA-2495", "Japan", "Japanese");

        // display results to user
        System.out.println("Active Domestic and International Divisions");
        System.out.println("===========================================");
        System.out.println();
        System.out.println("Company Division Name: " + div1.getDivName() + 
            "\nCompany Account Number: " + div1.getAcctNumber() + "\nDomestic Division Location: " 
            + div1.getDivState());
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.println("Company Division Name: " + div2.getDivName() + 
            "\nCompany Account Number: " + div2.getAcctNumber() + "\nDomestic Division Location: " 
            + div2.getDivState());
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.println("Company Division Name: " + div3.getDivName() + 
            "\nCompany Account Number: " + div3.getAcctNumber() + "\nInternational Division Location: "
            + div3.getDivCountry() + "\nPrimary Division Language: " + div3.getDivLanguage());
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.println("Company Division Name: " + div4.getDivName() + 
            "\nCompany Account Number: " + div4.getAcctNumber() + "\nInternational Division Location: "
            + div4.getDivCountry() + "\nPrimary Division Language: " + div4.getDivLanguage());
        System.out.println("===========================================");
        System.out.println();
    }

}
