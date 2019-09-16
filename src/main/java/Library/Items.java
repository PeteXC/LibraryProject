package Library;

public abstract class Items {

    private String itemID;
    private String itemName;
    private String itemType;
    private String author;
    private String publication;
    private String publicationYear;

    public Items(String itemID, String itemName, String itemType, String author, String publication, String publicationYear) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemType = itemType;
        this.author = author;
        this.publication = publication;
        this.publicationYear = publicationYear;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

}
