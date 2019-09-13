package Library;

public class Customers extends People {

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
