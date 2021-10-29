package ca.ConcordiaCCE_Fall2021.Class_13;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String perCode;

    static int lastId = 0;

    public Student(String firstName, String lastName, String perCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.perCode = perCode;

        this.id = ++lastId;
    }

    public static void SetLastId(int newId)
    {
        Student.lastId = newId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPerCode() {
        return perCode;
    }

    public void setPerCode(String perCode) {
        this.perCode = perCode;
    }
}
