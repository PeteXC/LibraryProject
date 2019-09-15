package Library;

import java.net.UnknownHostException;


public class Main {

    public static void main(String[] args) throws UnknownHostException {

        MongoAPI db = new MongoAPI();
        db.changeCollection(SelectCollection.CUSTOMERS);

        Customers c = new Customers(
                "1", "Daniel", "Radcliffe", "DRad@gmail.com",
                "SE45E45", "93920049", 30, true, new String[]{"1", "2"});

        db.storeObj(MongoAPI.getCustomerObj(c), SelectCollection.CUSTOMERS, true);
        db.debugPeopleObj("1");
        db.deletePeopleObj("1", true);


        System.out.println("Session terminated");
//        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
//        DB database = mongoClient.getDB("LibraryDatabase");
//        DBCollection collection = database.getCollection("people");
//
//        List<Integer> books = Arrays.asList(27464, 747854);
//        DBObject person = new BasicDBObject("_id", "jo")
//                .append("name", "Jo Bloggs")
//                .append("address", new BasicDBObject("street", "123 Fake St")
//                        .append("city", "Faketon")
//                        .append("state", "MA")
//                        .append("zip", 12345))
//                .append("books", books);
//
//        collection.insert(person);
//
//        System.out.println("Mongo Stored data");
//
//        DBObject query = new BasicDBObject("_id", "jo");
//        DBCursor cursor = collection.find(query);
//        DBObject jo = cursor.one();
//        System.out.println((String)cursor.one().get("name"));

    }

    public static int letsTry(int i){
        return i*i;
    }

}
