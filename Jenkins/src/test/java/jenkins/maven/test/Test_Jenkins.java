package jenkins.maven.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Jenkins {

	@Test
	public void samplecode() {
		
		System.out.println("Equals");
		String s1="sravanth";
		String s2="sravanth";
		Assert.assertEquals(s1, s2);
	}
	@Test
	public void tolower() {
		
		System.out.println("Lowercase");
		String s1="sravanth";
		String s2="SRAVANTH";
		Assert.assertEquals(s1, s2.toLowerCase());
	}
	@Test
	public void touppercase() {
		
		System.out.println("Uppercase");
		String s1="SRAVANTH";
		String s2="sravanth";
		Assert.assertEquals(s1, s2.toUpperCase());
	}
	@Test
	public void equalgnorecase() {
		
		System.out.println("EqualgnoreCase");
		String s1="SravanTH";
		String s2="sravanth";
		Assert.assertEquals(s1.equalsIgnoreCase(s2), s2.equalsIgnoreCase(s1));
	}
}
