import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product p1, p2;

    @BeforeEach
    void setUp() {

        p1 = new Product("000000", "Box", "Stores items", 10);
        p2 = new Product("000001", "Phone", "Can call people", 100);

    }

    @Test
    void testConstructor() {

        Product testProduct = new Product("000004", "Book", "Can use to read", 50);
        assertEquals("000004", testProduct.getID());
        assertEquals("Book", testProduct.getName());
        assertEquals("Can use to read", testProduct.getDescription());
        assertEquals(50.0, testProduct.getCost());
    }

    @Test
    void setName() {
        p1.setName("Pencil");
        assertEquals("Pencil", p1.getName());
    }

    @Test
    void setDescription() {
        p1.setDescription("Used for writing");
        assertEquals("Used for writing", p1.getDescription());
    }

    @Test
    void setCost() {
        p1.setCost(20);
        assertEquals(20.0, p1.getCost());
    }

    @Test
    void toCSVDataRecord() {
        assertEquals("000001, Phone, Can call people, 100.0", p2.toCSVDataRecord());
    }
}