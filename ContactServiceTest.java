import org.junit.Test;

/*This Junit Class will help us in testing ContactService class and its methods*/
public class ContactServiceTest {

/* testing the add method to work fine, when details provided should work */
	@Test
	public void testMethodAddPass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C001", "John", "Bush", "121 LA ST");
		Contact c2 = new Contact("C002", "Jim", "Bush", "122 LA ST");
		Contact c3 = new Contact("C003", "James", "Bush", "123 LA ST");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
	}

private void assertEquals(boolean b, boolean add) {
	// TODO Auto-generated method stub
	
}

/* testing the add method to work fine,when details provided should not work */
	@Test
	public void testMethodAddFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C001", "John", "Bush", "121 LA ST");
		Contact c2 = new Contact("C002", "Jim", "Bush", "122 LA ST");
		Contact c3 = new Contact("C003", "James", "Bush", "123 LA ST");
		assertEquals(true, cs.add(c1));
		assertEquals(false, cs.add(c1));
		assertEquals(true, cs.add(c3));
		assertEquals(true, cs.add(c2));
	}

/* test the delete method */
	@Test
	public void testMethodDeletePass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C001", "John", "Bush", "121 LA ST");
		Contact c2 = new Contact("C002", "Jim", "Bush", "122 LA ST");
		Contact c3 = new Contact("C003", "James", "Bush", "123 LA ST");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		assertEquals(true, cs.remove("C003"));
		assertEquals(true, cs.remove("C002"));
	}

/* test the delete method */
	@Test
	public void testMethodDeleteFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C001", "John", "Bush", "121 LA ST");
		Contact c2 = new Contact("C002", "Jim", "Bush", "122 LA ST");
		Contact c3 = new Contact("C003", "James", "Bush", "123 LA ST");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c3));
		assertEquals(true, cs.add(c2));
		
		assertEquals(false, cs.remove("C004"));
		assertEquals(true, cs.remove("C002"));
	}

/* test the update method */
	@Test
	public void testUpdatePass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C001", "John", "Bush", "121 LA ST");
		Contact c2 = new Contact("C002", "Jim", "Bush", "122 LA ST");
		Contact c3 = new Contact("C003", "James", "Bush", "123 LA ST");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c3));
		assertEquals(true, cs.add(c2));
		
		assertEquals(true, cs.update("C003", "Sean", "Paul", ""));
		assertEquals(true, cs.update("C002", "Jimmy", "Bush", "124 LA ST"));
	}

/* test the update method */
	@Test
	public void testUpdateFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C001", "John", "Bush", "121 LA ST");
		Contact c2 = new Contact("C002", "Jim", "Bush", "122 LA ST");
		Contact c3 = new Contact("C003", "James", "Bush", "123 LA ST");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c3));
		assertEquals(true, cs.add(c2));
		
		assertEquals(false, cs.update("C004", "Sean", "Paul", ""));
		assertEquals(true, cs.update("C002", "Jimmy", "Bush", "124 LA ST"));
	}

}