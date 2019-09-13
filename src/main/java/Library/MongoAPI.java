package Library;

import com.mongodb.*;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import java.net.UnknownHostException;
import Library.SelectCollection;

public class MongoAPI {

    private SelectCollection selectedCollection;
    private DBCollection collection;
    private MongoClient mongoClient;
    private DB database;


    public MongoAPI() throws UnknownHostException {

        this.mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        this.database = mongoClient.getDB("LibraryDatabase");

        // Choose default collection to use;
        this.selectedCollection = SelectCollection.BOOKS;
        this.collection = database.getCollection(String.valueOf(this.selectedCollection));
    }

    public void changeCollection(SelectCollection selection) {
        this.collection = database.getCollection(String.valueOf(selection));
    }

    public static final DBObject getCustomerObj(Customers c) {
        return new BasicDBObject("ID", c.getID())
                .append("First Name", c.getFirstName())
                .append("Last Name", c.getLastName())
                .append("Email", c.getEmail())
                .append("Post Code", c.getPostCode())
                .append("Phone Number", c.getPhoneNum())
                .append("Age", c.getAge())
                .append("Has Loan?", c.isBooksOnLoan())
                .append("Books on Loan", c.getBooksOnLoanIDs());
    }

    public final void storeObj(DBObject obj) {
        this.collection.insert(obj);
    }
}
