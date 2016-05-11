package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import exceptions.DeckException;
import pokerBase.Card;
import pokerBase.Deck;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}

	public void isEven() {
		MyInteger one = new MyInteger(6);
		MyInteger two = new MyInteger(5);
		assertTrue(one.isEven());
		assertFalse(two.isEven());
	}


	public void isOdd() {
		 MyInteger one = new MyInteger(5);
		 MyInteger two = new MyInteger(6);
		assertTrue(one.isOdd());
		assertFalse(two.isOdd());
	}
	
	public void isPrime() {
		MyInteger one = new MyInteger(3);
		MyInteger two = new MyInteger(4);
		assertTrue(MyInteger.isPrime());
		assertFalse(MyInteger.isPrime());
	}
}