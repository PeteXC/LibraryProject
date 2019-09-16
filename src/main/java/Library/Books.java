package Library;

public class Books extends Items {

    private int numPages;
    private boolean isHardCover;

    public Books(String itemID, String itemName, String itemType, String author,
                 String publication, String publicationYear, int numPages,
                 boolean isHardCover) {
        super(itemID, itemName, itemType, author, publication, publicationYear);
        this.numPages = numPages;
        this.isHardCover = isHardCover;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

}
