public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee ("Иванов Иван Иванович", 2,45000);
        employees[1] = new Employee ("Семенов Семен Семенович", 3,46000);
        employees[2] = new Employee ("Сергеев Сергей Сергеевич", 1,47000);
        employees[3] = new Employee ("Юрьев Юрий Юрьевич", 4,48000);
        employees[4] = new Employee ("Поликарпов Поликарп Поликарпович ", 4,49000);
        employees[5] = new Employee ("Степанов Степан Степанович", 3,50000);
        employees[6] = new Employee ("Лактионов Локоть Локтевич", 5,51000);
        employees[7] = new Employee ("Федотов Федот Федотович", 4,69000);
        employees[8] = new Employee ("Дмитров Дмитрий Дмитриевич", 3,72000);
        employees[9] = new Employee ("Иванов Иван Иванович", 1,30000);

        printAll();
        System.out.println("Сумма зарплат = " + salarySum());
        System.out.println("Сотрудник получающий наименьшую зарплату " + findMin());
        System.out.println("Сотрудник получающий наибольшую зарплату " + findMax());
        System.out.println("Среднее значение заплаты " + getAverage());
        printFullName();
        raiseSalary(50);
        printAll();
    }

    public static void printAll(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double salarySum(){
        double salary = 0.0;
        for (Employee employee : employees) {
            salary += employee.getSalary();
        }
        return salary;
    }

    public static Employee findMin(){
        Employee minEmployy = null;
        for (Employee employee : employees) {
            if(minEmployy == null || employee.getSalary() < minEmployy.getSalary()){
                minEmployy = employee;
            }
        }
        return minEmployy;
    }

    public static Employee findMax(){
        Employee maxEmloyy = null;
        for (Employee employee : employees) {
            if(maxEmloyy == null || employee.getSalary() > maxEmloyy.getSalary()){
                maxEmloyy = employee;
            }
        }
        return maxEmloyy;
    }
    public static double getAverage(){
        return salarySum() / employees.length;
    }
    public static void printFullName(){
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
    public static void raiseSalary(int percent){
        double koef = 1 + percent / 100.0;
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * koef);
        }
    }
}
