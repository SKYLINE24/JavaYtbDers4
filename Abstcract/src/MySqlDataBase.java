public class MySqlDataBase extends AbstractDataBase{
    @Override
    void update() {
        System.out.println("Mysql güncellendi...");
    }

    @Override
    void get() {
        System.out.println("Mysql verileri Aldı...");

    }
}
