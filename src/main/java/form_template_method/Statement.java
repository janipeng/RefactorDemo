package form_template_method;

import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer customer) {
        String result = headerString(customer);
        Enumeration rentals = customer.getRentals().elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += eachRentalString(each);
        }
        result += footerString(customer);
        return result;
    }

    protected abstract String footerString(Customer customer);

    protected abstract String eachRentalString(Rental each);

    protected abstract String headerString(Customer customer);

}
