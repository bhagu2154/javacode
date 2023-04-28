package classandobject;

public class Employee {
    String name;
    int yearofjoin;
    String address;

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "robert";
        employee1.yearofjoin = 1994;
        employee1.address="64c-wallsStreat";

        Employee employee2 = new Employee();
        employee2.name = "sham";
        employee2.yearofjoin = 2000;
        employee2.address="68D-wallsStreat";

        Employee employee3 = new Employee();
        employee3.name = "john";
        employee3.yearofjoin = 1999;
        employee3.address="26B-wallStreat";

        System.out.println(employee1.name+"\t"+employee1.yearofjoin+"\t"+  employee1.address+"\t");
        System.out.println(employee2.name+"\t"+employee2.yearofjoin+"\t"+  employee2.address+"\t");
        System.out.println(employee3.name+"\t"+employee3.yearofjoin+"\t"+  employee3.address+"\t");




    }
}