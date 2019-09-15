package Library;

import com.mongodb.*;

import java.net.UnknownHostException;

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

    // Compose the DBObject for a Customer domain object
    public static final DBObject getCustomerObj_DB(Customers c) {
        return new BasicDBObject("_id", c.getFirstName() + " " + c.getLastName())
                .append("ID", c.getID())
                .append("First Name", c.getFirstName())
                .append("Last Name", c.getLastName())
                .append("Email", c.getEmail())
                .append("Post Code", c.getPostCode())
                .append("Phone Number", c.getPhoneNum())
                .append("Age", c.getAge())
                .append("Has Loan?", c.isBooksOnLoan())
                .append("Books on Loan", c.getBooksOnLoanIDs());
    }

    // Compose the DBObject for a Employee domain object
    public static final DBObject getEmployeeObj_DB(Employees e) {
        return new BasicDBObject("_id", e.getFirstName() + " " + e.getLastName())
                .append("ID", e.getID())
                .append("First Name", e.getFirstName())
                .append("Last Name", e.getLastName())
                .append("Email", e.getEmail())
                .append("Post Code", e.getPostCode())
                .append("Phone Number", e.getPhoneNum())
                .append("Age", e.getAge())
                .append("Salary", e.getSalary())
                .append("Job Title", e.getJobTitle())
                .append("Security Level", e.getSecurityLevel());
    }

    public static final Employees getEmployeeObj_DOM(DBObject e) {
        return new Employees(e.get("ID").toString(),
                e.get("First Name").toString(),
                e.get("Last Name").toString(),
                e.get("Email").toString(),
                e.get("Post Code").toString(),
                e.get("Phone Number").toString(),
                Integer.parseInt(e.get("Age").toString()),
                Integer.parseInt(e.get("Salary").toString()),
                e.get("Job Title").toString(),
                Integer.parseInt(e.get("Security Level").toString()));
    }

    // Store an object into a specified collection
    public final void storeObj(DBObject obj, SelectCollection col, boolean debug) {

        if (this.selectedCollection == col) {

            this.collection.insert(obj);
            if (debug) {System.out.println("Stored Object");};

        } else {

            this.selectedCollection = col;
            this.collection.insert(obj);
            if (debug) {System.out.println("Stored Object");};


        }
    }

    public final void deletePeopleObj(String ID, boolean debug) {
        DBObject query = new BasicDBObject("ID", ID);
        DBCursor cursor = collection.find(query);
        DBObject a = cursor.one();
        this.collection.remove(a);
        if (debug) {System.out.println("Removed Object " + a.toString());};
//        DBObject query = new BasicDBObject("ID", obj.)
    }

    public final void debugPeopleObj(String ID) {
        DBObject query = new BasicDBObject("ID", ID);
        DBCursor cursor = collection.find(query);
        DBObject a = cursor.one();
        System.out.println("Object:\n" + a.toString() + "\n");
    }
}
