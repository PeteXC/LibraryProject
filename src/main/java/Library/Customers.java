package Library;

public class Customers extends People {

    public Customers(String ID, String firstName, String lastName, String email,
                     String postCode, String phoneNum, int age, boolean booksOnLoan,
                     String[] booksOnLoanIDs) {
        super(ID, firstName, lastName, email, postCode, phoneNum, age);
        this.booksOnLoan = booksOnLoan;
        this.booksOnLoanIDs = booksOnLoanIDs;
    }

    private boolean booksOnLoan;
    private String[] booksOnLoanIDs;

    public boolean isBooksOnLoan() {
        return booksOnLoan;
    }

    public void setBooksOnLoan(boolean booksOnLoan) {
        this.booksOnLoan = booksOnLoan;
    }

    public String[] getBooksOnLoanIDs() {
        return booksOnLoanIDs;
    }

    public void setBooksOnLoanIDs(String[] booksOnLoanIDs) {
        this.booksOnLoanIDs = booksOnLoanIDs;
    }
}
