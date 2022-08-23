public class main {
    public static void main(String[] args){
        /*Employee employee = new Employee("Mustafa Murat","Bilişim",3000);
        employee.showInfos();*/
        Manager manager = new Manager("Mustafa murat coşkun","bilişim",4000,10);
        manager.showInfos();
        manager.raiseSalary(100);
    }
}
