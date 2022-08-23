public class Main {
    public static void main(String[] args){
        //IDatabase database = new IDatabase();
        //obje oluşturamayacağımızı söylüyor

        //obje oluşturamazsak da referans atayabiliyoruz
        IDatabase database1 = new Customer();
        IDatabase database2 = new Student();

        database1.log();
        database2.log();
        //aşşağıdaki kod yerine referans atadığımız için kullanabilir duruma geliyoruz ve yorum satırı haline getirdim onun yerine yukarıdaki logları yazıyoruz
        /*
        Customer customer = new Customer();
        Student student = new Student();
        student.log();
        customer.log();
        */
    }

}
