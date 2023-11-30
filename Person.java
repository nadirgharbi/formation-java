public class Person {
    private Integer idNumber;
    private String name;
    private Integer age;
    private String mail;

//    Constructor
    public Person(Integer idNumber, String name, Integer age, String mail){
        this.idNumber = idNumber;
        this.name = name;
        this.age = age;
        this.mail = mail;
    }

    public void getUser() {
        System.out.println("Hello " + this.name + ". \n" + "Your Id Number is " + this.idNumber + ". \n" + "Email : " + this.mail + "\n" + "Age : " + this.age);
    }
}
