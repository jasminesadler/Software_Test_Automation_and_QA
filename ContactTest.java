import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContactTest {
    Contact contact = new Contact("1", "firstName", "lastName", "fake street 2101"); // making the object as a class member so that all the methods can access it

    @Test
   public void getContactID() {
        assertEquals("1", contact.getContactID());
    }

    @Test
    public void getFirstName() {
        assertEquals("firstName", contact.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("lastName", contact.getLastName());
    }

    @Test
    public void getAddress() {
        assertEquals("fake street 2101", contact.getNumberAddress());
    }

    @Test
    public void testToString() {
        assertEquals("Contact [contactID=1, firstName=firstName, lastName=lastName, numberAddress=fake street 2101]", contact.toString());
    }

}
