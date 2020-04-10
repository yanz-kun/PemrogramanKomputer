/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produk;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
/**
 *
 * @author Yanuar Ardani N
 */
public class Koneksi {

    /**
     * @param args the command line arguments
     */
    public static MongoDatabase sambungDB() {
        // TODO code application logic here
        try {
            MongoClient client = MongoClients.create();
            MongoDatabase database = client.getDatabase("product");
            System.out.println("Koneksi sukses!");
            return database;
        } catch (Exception e) {
            System.err.println("Koneksi Gagal !"+e.getMessage());
        }
        return null;
    }
    
}
