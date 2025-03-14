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

public class InternationalDivision extends Division implements InternationalInterface {

    // declare class variables
    public String divisionCountry;
    public String divisionLanguage;

    // class constructor - includes parent class variables
    public InternationalDivision(String companyDivisionName, String companyAccountNumber, 
            String divCountry, String divLanguage) {

        super(companyDivisionName, companyAccountNumber);
        this.divisionCountry = divCountry;
        this.divisionLanguage = divLanguage;
    }

    // overrides for class methods to access variables
    @Override
    public String getDivCountry() {
        return divisionCountry;
    }
    @Override
    public String getDivLanguage() {
        return divisionLanguage;
    }

    // override for parent class method
    @Override 
    public void display() { }

}