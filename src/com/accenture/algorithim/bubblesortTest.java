/**
 * 
 */
package com.accenture.algorithim;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author n.a.jaiswal
 *
 */
class bubblesortTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		int element[] = {89,45,32,67,71,90,29,23,0,1,8,223,457,398};
		bubblesort obj = new bubblesort();
		int sortElement[] = obj.sort(element);
		/*for(int i=0;i<sortElement.length;i++) {
			
			System.out.println(sortElement[i]);
		}*/
		int sortElement2[]=obj.newSort(element);
		assertArrayEquals(sortElement2,sortElement );
	}

}
