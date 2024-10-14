package Lab2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task5 {
 //a
    static Person[] personArray;

    @BeforeAll
    @Test
    static void setUpPersonArray() {
        Random random = new Random();
        personArray = new Person[5];
        for (int i = 0; i < 5; i++) {
            personArray[i] = new Person(random.nextInt(18, 80));
        }
    }


    @Test
    void testEveryPerson() {
        for(Person person : personArray) {
            assertTrue(person.isAdult());
        }
    }

    @AfterAll
    @Test
    static void deleteArray() {
        personArray = null;
        assertNull(personArray);
    }
}
