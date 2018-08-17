package form_template_method;

import java.util.Enumeration;

public class TextStatement extends Statement {

    protected String footerString(Customer customer) {
        return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n"
                + "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }

    protected String eachRentalString(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
    }

    protected String headerString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }
}
