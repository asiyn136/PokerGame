package testPoker;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import poker.Poker;

public class PokerTest {
	private Poker poker;
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
	@BeforeEach
	public void setUp() throws Exception { poker = new Poker(); }
    /**
     * Tears down the test fixture.
     * Called after every test case method.
     */
	public void tearDown() {}
	
	// Test case 1: n = 0, cards = { }
	@Test
	public void testNoCards() {
		boolean result;
		String[] input = null;
		result = poker.isFullHouse(input, 0);
		assertEquals(false, result);
	}
	// Test case 2: n = 5, cards = {"C2", "D2", "H2", "S3", "S4"};
	@Test
	public void test22234() {
		boolean result;
		String[] input = new String[] {"C2", "D2", "H2", "S3", "S4"};
		result = poker.isFullHouse(input, 5);
		assertEquals(false, result);
	}
	// Test case 3: n = 5, cards = {"DJ", "SJ", "CK", "DK", "HK"};
	@Test
	public void testJJKKK() {
		boolean result;
		String[] input = new String[] {"DJ", "SJ", "CK", "DK", "HK"};
		result = poker.isFullHouse(input, 5);
		assertEquals(true, result);
	}
	// Test case 4: n = 5, cards = {"C3", "D3", "S3", "HX", "SX"};
	@Test
	public void test333XX() {
		boolean result;
		String[] input = new String[] {"C3", "D3", "S3", "HX", "SX"};
		result = poker.isFullHouse(input, 5);
		assertEquals(true, result);
	}
	// Test case 5: n = 5, cards = {"C2", "D2", "C3", "D3", "C4"};
	@Test
	public void test22334() {
		boolean result;
		String[] input = new String[] {"C2", "D2", "C3", "D3", "C4"};
		result = poker.isFullHouse(input, 5);
		assertEquals(false, result);
	}
	// Test case 6: n = 5, cards = {"CA", "C2", "C3", "C4", "C5"};
	@Test
	public void testA2345() {
		boolean result;
		String[] input = new String[] {"CA", "C2", "C3", "C4", "C5"};
		result = poker.isFullHouse(input, 5);
		assertEquals(false, result);
	}
	// Test case 7: n = 5, cards = {"C6", "D6", "H6", "S6", "D7"};
	@Test
	public void test66667() {
		boolean result;
		String[] input = new String[] {"C6", "D6", "H6", "S6", "D7"};
		result = poker.isFullHouse(input, 5);
		assertEquals(false, result);
	}
	// Test case 8: n = 5, cards = {"CA", "DX", "HX", "SX", "DK"};
	@Test
	public void testAXXXK() {
		boolean result;
		String[] input = new String[] {"CA", "DX", "HX", "SX", "DK"};
		result = poker.isFullHouse(input, 5);
		assertEquals(false, result);
	}
	
	// Test case 9: n = 5, cards = {"C5", "C6", "D6", "H6", "S6"};
	@Test
	public void test56666() {
		boolean result;
		String[] input = new String[] {"C5", "C6", "D6", "H6", "S6"};
		result = poker.isFullHouse(input, 5);
		assertEquals(false, result);
	}
	
	// Test case 10: n = 6, cards = {"C5", "D5", "C6", "D6", "H6", "S6"};
	@Test
	public void test556666() {
		boolean result;
		String[] input = new String[] {"C5", "D5", "C6", "D6", "H6", "S6"};
		result = poker.isFullHouse(input, 6);
		assertEquals(false, result);
	}
	
	// Test case threeOfaKind 1: n = 5, cards = {"C6", "D6", "H6", "S6", "D7"};
	@Test
	public void test_threeOf66667() {
		boolean result;
		String[] input = new String[] {"C6", "D6", "H6", "S6", "D7"};
		result = poker.isThreeOfaKind(input, 5);
		assertEquals(true, result);
	}

	// Test case threeOfaKind 2: n = 5, cards = {"C5", "D6", "H6", "S6", "C6"};
	@Test
	public void test_threeOf56666() {
		boolean result;
		String[] input = new String[] {"C5", "D6", "H6", "S6", "C6"};
		result = poker.isThreeOfaKind(input, 5);
		assertEquals(true, result);
	}
	
	// Test case threeOfaKind 3: n = 5, cards = {"C5", "D6", "H6", "S6", "D7"};
	@Test
	public void test_threeOf56667() {
		boolean result;
		String[] input = new String[] {"C5", "D6", "H6", "S6", "D7"};
		result = poker.isThreeOfaKind(input, 5);
		assertEquals(true, result);
	}
	
	// Test case threeOfaKind 4: n = 5, cards = {"C6", "D6", "H7", "S7", "D7"};
	@Test
	public void test_threeOf66777() {
		boolean result;
		String[] input = new String[] {"C6", "D6", "H7", "S7", "D7"};
		result = poker.isThreeOfaKind(input, 5);
		assertEquals(true, result);
	}
	
	// Test case threeOfaKind 5: n = 5, cards = {"C6", "D6", "H6", "S7", "D7"};
	@Test
	public void test_threeOf66677() {
		boolean result;
		String[] input = new String[] {"C6", "D6", "H6", "S7", "D7"};
		result = poker.isThreeOfaKind(input, 5);
		assertEquals(true, result);
	}
	
	// Test case threeOfaKind 6: n = 5, cards = {"C5", "D5", "H6", "S7", "D7"};
	@Test
	public void test_threeOf55677() {
		boolean result;
		String[] input = new String[] {"C5", "D5", "H6", "S7", "D7"};
		result = poker.isThreeOfaKind(input, 5);
		assertEquals(false, result);
	}

	
	// Test case twoPairs 1: n = 5, cards = {"C6", "D6", "H7", "S7", "D8"};
	@Test
	public void test_twoPairs66778() {
		boolean result;
		String[] input = new String[] {"C6", "D6", "H7", "S7", "D8"};
		result = poker.isTwoPairs(input, 5);
		assertEquals(true, result);
	}

	// Test case twoPairs 2: n = 5, cards = {"C6", "D7", "H7", "S8", "D8"};
	@Test
	public void test_twoPairs67788() {
		boolean result;
		String[] input = new String[] {"C6", "D7", "H7", "S8", "D8"};
		result = poker.isTwoPairs(input, 5);
		assertEquals(true, result);
	}
	
	// Test case twoPairs 3: n = 5, cards = {"C6", "D6", "H7", "S8", "D8"};
	@Test
	public void test_twoPairs66788() {
		boolean result;
		String[] input = new String[] {"C6", "D6", "H7", "S8", "D8"};
		result = poker.isTwoPairs(input, 5);
		assertEquals(true, result);
	}
	
	// Test case twoPairs 4: n = 5, cards = {"C6", "D6", "H6", "S6", "D7"};
	@Test
	public void test_twoPairs66667() {
		boolean result;
		String[] input = new String[] {"C6", "D6", "H6", "S6", "D7"};
		result = poker.isTwoPairs(input, 5);
		assertEquals(true, result);
	}
	
	// Test case twoPairs 5: n = 5, cards = {"C5", "C6", "D6", "H6", "S6"};
	@Test
	public void test_twoPairs56666() {
		boolean result;
		String[] input = new String[] {"C5", "C6", "D6", "H6", "S6"};
		result = poker.isTwoPairs(input, 5);
		assertEquals(true, result);
	}
	
	// Test case twoPairs 6: n = 5, cards = {"C6", "D6", "H6", "S7", "S8"};
	@Test
	public void test_twoPairs66678() {
		boolean result;
		String[] input = new String[] {"C6", "D6", "H6", "S7", "S8"};
		result = poker.isTwoPairs(input, 5);
		assertEquals(false, result);
	}
	
	// Test case twoPairs 7: n = 5, cards = {"C5", "D6", "H7", "S8", "S9"};
	@Test
	public void test_twoPairs56789() {
		boolean result;
		String[] input = new String[] {"C5", "D6", "H7", "S8", "S9"};
		result = poker.isTwoPairs(input, 5);
		assertEquals(false, result);
	}
}
