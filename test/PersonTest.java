import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2;

    @BeforeEach
    void setUp()
    {

        p1 = new Person("000000", "Joe", "Tester1", "Mr.", 2000);
        p2 = new Person("000001", "Jane", "Tester2", "Mrs.", 1990);

    }

    @Test
    void testConstructor() {

        Person testPerson = new Person("000003", "Example", "Test", "Mr.", 1980);
        assertEquals("000003", testPerson.getID());
        assertEquals("Example", testPerson.getFirstName());
        assertEquals("Test", testPerson.getLastName());
        assertEquals("Mr.", testPerson.getTitle());
        assertEquals(1980, testPerson.getYOB());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Billy");
        assertEquals("Billy", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p1.setLastName("Bob");
        assertEquals("Bob", p1.getLastName());
    }

    @Test
    void setTitle() {
        p1.setTitle("Dr.");
        assertEquals("Dr.", p1.getTitle());
    }

    @Test
    void setYOB() {
        p1.setYOB(1970);
        assertEquals(1970, p1.getYOB());
    }

    @Test
    void fullName() {
        assertEquals("Jane Tester2", p2.fullName());
    }

    @Test
    void formalName() {
        assertEquals("Mrs. Jane Tester2", p2.formalName());
    }

    @Test
    void getAge() {
        assertEquals("33", p2.getAge());
    }

    @Test
    void getAgeYear() {
        assertEquals("10", p2.getAge(2000));
    }

    @Test
    void toCSVDataRecord() {
        assertEquals("000001, Jane, Tester2, Mrs., 1990", p2.toCSVDataRecord());
    }
}