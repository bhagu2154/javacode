public class student {
    int rollno;
    String name;
    int phonenumber;
    String address;

    public static void main(String[] args) {
        System.out.println("rollno"+"\t"+"name"+ "\t" +"phonenumber"+"\t"+"address");
        student student1 = new student();
        student1.rollno = 2;
        student1.name = "john";
        student1.phonenumber = 698375927;
        student1.address = "solapur";
        student student2 = new student();
        student2.rollno = 3;
        student2.name = "sam";
        student2.phonenumber = 593458209;
        student2.address = "pune";
        System.out.println(student1.rollno+"\t"+student1.name+"\t"+student1.phonenumber+"\t"+student1.address);
        System.out.println(student2.rollno+"\t"+student2.name+"\t"+student2.phonenumber+"\t"+student2.address);

    }

}