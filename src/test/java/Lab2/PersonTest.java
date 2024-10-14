package Lab2;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonTest {
    Person adult = new Person(21);
    Person child = new Person(7);

    @Order(2)
    @Test
    void testIsAdultOver18(){
        assertTrue(adult.isAdult());
    }

    @Test
    void testIsAdultUnder18(){
        assertFalse(child.isAdult());
    }

    @Order(1)
    @Test
    void testCanGoToSchool() {
        assertTrue(child.canGoToSchool());
    }

    @Test
    public void testIllegalArgumentException() {
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                {Person person = new Person(-2);}
        );

        assertEquals(
                "A person’s age cannot be less than 0", e.getMessage());
    }
}