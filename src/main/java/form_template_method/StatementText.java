package form_template_method;

public class StatementText extends Statement {

    public String footerString(Customer customer) {
        String footer = "Amount owed is " + customer.getTotalCharge() + "\n";
        footer += "You earned " + customer.getTotalFrequentRenterPoints() + " frequent renter points";
        return footer;
    }

    public String eachRentalString(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
    }

    public String headerString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }
}
