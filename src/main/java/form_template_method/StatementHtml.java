package form_template_method;

import java.util.Enumeration;

public class StatementHtml {
    public static String value(Customer customer) {
        String result = headerString(customer);
        Enumeration rentals = customer.getRentals().elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += eachRentalString(each);
        }
        result += footerString(customer);
        return result;
    }

    public static String footerString(Customer customer) {
        String footer = "<P>You owe<EM>" + String.valueOf(customer.getTotalCharge()) + "</EM><P>\n";
        footer += "On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
        return footer;
    }

    public static String eachRentalString(Rental each) {
        return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
    }

    public static String headerString(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }
}
