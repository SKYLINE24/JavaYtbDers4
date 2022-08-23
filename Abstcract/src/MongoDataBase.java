public class MongoDataBase extends AbstractDataBase{
    @Override
    void update() {
        System.out.println("Mongo güncellendi ...");
    }

    @Override
    void get() {
        System.out.println("Mongo Verileri Aldı...");
    }
}
