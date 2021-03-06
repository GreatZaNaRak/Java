import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestPartialArray {

	@Test
	public void testPartialArrayNull() {
		int[] a = null;
		assertNull(partialArray.partialArray(a, 0, 3));

	}

	@Test
	public void testPartialArrayNull_i_GreaterThan_j() {
		int[] a = { 1, 2, 3, 4, 5 };
		assertNull(partialArray.partialArray(a, 3, 0));
	}

	@Test
	public void testPartialArray_i_TooLarge() {
		int[] a = { 1, 2, 3, 4, 5 };
		assertNull(partialArray.partialArray(a, 5, 5));
	}

	@Test
	public void testPartialArray_j_TooLarge() {
		int[] a = { 1, 2, 3, 4, 5 };
		assertNull(partialArray.partialArray(a, 3, 6));

		int[] b = partialArray.partialArray(a, 3, 5);
		assertEquals(3, b.length);
		assertEquals(1, b[0]);
		assertEquals(2, b[1]);
		assertEquals(3, b[2]);

	}

	@Test
	public void testPartialArray_General_1() {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = partialArray.partialArray(a, 1, 3);
		assertEquals(3, b.length);
		assertEquals(1, b[0]);
		assertEquals(4, b[1]);
		assertEquals(5, b[2]);

	}

	@Test
	public void testPartialArray_General_2() {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = partialArray.partialArray(a, 1, 4);
		assertEquals(2, b.length);
		assertEquals(1, b[0]);
		assertEquals(5, b[1]);

	}

	@Test
	public void testPartialArray_General_3() {
		int[] a = { 1, 2, 3, 4 };
		int[] b = partialArray.partialArray(a, 1, 2);
		assertEquals(3, b.length);
		assertEquals(1, b[0]);
		assertEquals(3, b[1]);
		assertEquals(4, b[2]);

	}

}
