package Java_HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class massSort1Test {

	@Test
	public void testBubble() {

		int in[] = { 2, 4, 1, 8, 4, 9, 5, 7 };
		int out[] = { 1, 2, 4, 4, 5, 7, 8, 9 };
		int res[] = massSort1.Bubble(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testBubble_1() {

		int in[] = { 2, 4, 0, 8, -4, 9, -5, 7 };
		int out[] = { -5, -4, 0, 2, 4, 7, 8, 9 };
		int res[] = massSort1.Bubble(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testBubble_2() {

		int in[] = { -2, -4, 0, -8, -4, -9, -5, -7 };
		int out[] = { -9, -8, -7, -5, -4, -4, -2, 0 };
		int res[] = massSort1.Bubble(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testBubble_3() {

		int in[] = { -2, -4 };
		int out[] = { -4, -2 };
		int res[] = massSort1.Bubble(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testBubble_4() {

		int in[] = { 4, 2 };
		int out[] = { 2, 4 };
		int res[] = massSort1.Bubble(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testSelect() {

		int in[] = { 2, 4, 1, 8, 4, 9, 5, 7 };
		int out[] = { 1, 2, 4, 4, 5, 7, 8, 9 };
		int res[] = massSort1.Select(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testSelect_1() {

		int in[] = { 2, 4, 0, 8, -4, 9, -5, 7 };
		int out[] = { -5, -4, 0, 2, 4, 7, 8, 9 };
		int res[] = massSort1.Select(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testSelect_2() {

		int in[] = { -2, -4, 0, -8, -4, -9, -5, -7 };
		int out[] = { -9, -8, -7, -5, -4, -4, -2, 0 };
		int res[] = massSort1.Select(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testSelect_3() {

		int in[] = { -2, -4 };
		int out[] = { -4, -2 };
		int res[] = massSort1.Select(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testSelect_4() {

		int in[] = { 4, 0 };
		int out[] = { 0, 4 };
		int res[] = massSort1.Select(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testInsert() {

		int in[] = { 2, 4, 1, 8, 4, 9, 5, 7 };
		int out[] = { 1, 2, 4, 4, 5, 7, 8, 9 };
		int res[] = massSort1.Insert(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testInsert_1() {

		int in[] = { 2, 4, 0, 8, -4, 9, -5, 7 };
		int out[] = { -5, -4, 0, 2, 4, 7, 8, 9 };
		int res[] = massSort1.Insert(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testInsert_2() {

		int in[] = { -2, -4, 0, -8, -4, -9, -5, -7 };
		int out[] = { -9, -8, -7, -5, -4, -4, -2, 0 };
		int res[] = massSort1.Insert(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testInsert_3() {

		int in[] = { -2, -4 };
		int out[] = { -4, -2 };
		int res[] = massSort1.Insert(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testInsert_4() {

		int in[] = { 4, 0 };
		int out[] = { 0, 4 };
		int res[] = massSort1.Insert(in);
		assertArrayEquals(out, res);
	}

}
