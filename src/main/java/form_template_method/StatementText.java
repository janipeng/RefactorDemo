package form_template_method;

import java.util.Enumeration;

public class StatementText {
    public static String value(Customer customer) {
        String result = headerString(customer);
        Enumeration rentals = customer.getRentals().elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += eachRentalString(each);
        }

        result += footerString(customer);
        return result;
    }

    public static String footerString(Customer customer) {
        String footer = "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n";
        footer += "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return footer;
    }

    public static String eachRentalString(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
    }

    public static String headerString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }
}
