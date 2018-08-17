package form_template_method;

import java.util.Enumeration;

public abstract class Statement {
    String value(Customer customer) {
        Enumeration rentals = customer.getRentals().elements();
        StringBuilder result = new StringBuilder(headerString(customer));
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result.append(eachRentalString(each));
        }

        result.append(footerString(customer));
        return result.toString();
    }

    protected abstract String footerString(Customer customer);

    protected abstract String eachRentalString(Rental rental);

    protected abstract String headerString(Customer customer);
}
