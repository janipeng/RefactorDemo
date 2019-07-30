package form_template_method;

public class StatementHtml extends Statement {

    public String footerString(Customer customer) {
        String footer = "<P>You owe<EM>" + customer.getTotalCharge() + "</EM><P>\n";
        footer += "On this rental you earned <EM>" + customer.getTotalFrequentRenterPoints() +
                "</EM> frequent renter points<P>";
        return footer;
    }

    public String eachRentalString(Rental each) {
        return each.getMovie().getTitle() + ": " + each.getCharge() + "<BR>\n";
    }

    public String headerString(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }
}
