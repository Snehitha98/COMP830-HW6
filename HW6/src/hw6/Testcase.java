package hw6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Testcase {
	DiceBag dicebag;

	@BeforeEach
	void setUp() throws Exception {
		dicebag = new DiceBag();
	}

	@AfterEach
	void tearDown() throws Exception {
		dicebag = null;
	}

	@Test
	void test() {
		DiceBag test = new DiceBag();
		int bagsizebefore = dicebag.bag.size();
		dicebag.addToken(new OrderDie("steve", "blue"));
		int bagsizeafter = dicebag.bag.size();
		assertEquals(bagsizebefore+1, bagsizeafter);
		
	}
	
	@Test
	void test1() {
		Token t = new OrderDie("Steve", "red");
		dicebag.addToken(t);
		String ret = " Dice left: " + dicebag.bag.size() + "\n"+t.toString()+"\n";
		assertEquals(ret,dicebag.toString());
	}
	
	@Test
	void testDrawToken(){
		Token t = new OrderDie("Tom", "red");
		Token t1;
		dicebag.addToken(t);
		dicebag.addToken(t);
		int bagSize=dicebag.bag.size();
		t1=dicebag.drawToken();
		int newbagSize=dicebag.bag.size();
		assertEquals(bagSize-1,newbagSize);
	}

}
