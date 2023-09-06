import java.util.Calendar;

public class Person {

    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String fullName()
    {
        return getFirstName() + " " + getLastName();
    }

    public String formalName()
    {
        return getTitle() + " " + fullName();
    }

    public String getAge()
    {
        Calendar c = Calendar.getInstance();
        int currentYear = c.get(Calendar.YEAR);
        return Integer.toString(currentYear - getYOB());
    }

    public String getAge(int year)
    {
        return Integer.toString(year - getYOB());
    }

    public String toCSVDataRecord()
    {
        return getID() + ", " + getFirstName() + ", " + getLastName() + ", " + getTitle() + ", " + getYOB();
    }
}
