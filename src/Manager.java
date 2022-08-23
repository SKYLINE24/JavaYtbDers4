public class Manager extends Employee {
    private int numOfEmployees;
    public Manager(String name, String department, int salary,int numOfEmployees) {
       //super ile değerlerimizi göndererek kullanabiliyoruz
        super(name,department,salary);
        this.numOfEmployees = numOfEmployees;

    }
    public void raiseSalary(int amount){
        System.out.println("Çalışanlara " + amount + "Tl zam yapıldı...");
    }
    @Override
    public void showInfos(){
        //bunu yazmak yerine yani kopyala yapıştır yerine super yazıyoruz
        /*System.out.println("Bilgiler");
        System.out.println("İsim: " + getName());
        System.out.println("Departman: " + getDepartment());
        System.out.println("Maaş: " + getSalary());*/
        super.showInfos();
        System.out.println("sorumlu kişi sayısı: " + this.numOfEmployees);

    }


}
