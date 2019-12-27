package com.String;

import org.junit.Assert;
import org.junit.Test;



public class StringUnitsTest {
	@Test
	public void testTrimall() {
		String hello="hello";
		
		Assert.assertEquals(StringUnits.trimAll(" hello"),hello);
		Assert.assertEquals(StringUnits.trimAll("   hello"),hello);
		Assert.assertEquals(StringUnits.trimAll(" hello "),hello);
		Assert.assertEquals(StringUnits.trimAll(" hello  "),hello);
		Assert.assertEquals(StringUnits.trimAll(" he llo"),hello);
		Assert.assertEquals(StringUnits.trimAll(" hel   lo"),hello);
		

	}
	@Test
	public void testReverse() {
		Assert.assertEquals(StringUnits.reverse("123"),"321");
		Assert.assertEquals(StringUnits.reverse("hello"),"olleh");
	}
}
