import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ValoresTest {

	@Test
	void testIns() {
		Valores valores = new Valores();
		assertEquals(true, valores.ins(1));
		assertEquals(true, valores.ins(2));
		assertEquals(true, valores.ins(3));
		assertEquals(true, valores.ins(4));
		assertEquals(true, valores.ins(5));
		assertEquals(true, valores.ins(6));
		assertEquals(true, valores.ins(7));
		assertEquals(true, valores.ins(8));
		assertEquals(true, valores.ins(9));
		assertEquals(true, valores.ins(10));
		assertEquals(false, valores.ins(11));
		assertEquals(false, valores.ins(-2));
	}
	
	@Test
	void testDel() {
		Valores valores = new Valores();
		
		assertEquals(-1, valores.del(10));
		
		valores.ins(1);
		valores.ins(2);
		valores.ins(3);
		valores.ins(4);
				
		assertEquals(3, valores.del(2));
		assertEquals(-1, valores.del(2));
		
		assertEquals(-1, valores.del(-2));
	}
	
	@Test
	void testSize() {
		Valores valores = new Valores();
		valores.ins(1);
		valores.ins(2);
		valores.ins(3);
		valores.ins(4);
				
		assertEquals(4, valores.size());
	}

}
