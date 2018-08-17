package form_template_method;

import java.util.Enumeration;

public abstract class Statement {
    String value(Customer customer) {
        Enumeration rentals = customer.getRentals().elements();
        String result = headerString(customer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += eachRentalString(each);
        }

        result += footerString(customer);   
        return result;
    }

    protected abstract String footerString(Customer customer);

    protected abstract String eachRentalString(Rental rental);

    protected abstract String headerString(Customer customer);
}
