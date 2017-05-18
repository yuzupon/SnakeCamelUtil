package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class SnakeCamelTest {

	@Test
	public void snakeToCamelcaseでabcがAbc() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="Abc";
		String actual=sc.snakeToCamelcase("abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでa_bがAB() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="AB";
		String actual=sc.snakeToCamelcase("a_b");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでab_cdがAbCd() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="AbCd";
		String actual=sc.snakeToCamelcase("ab_cd");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでabc_def_ghがAbcDefGh() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="AbcDefGh";
		String actual=sc.snakeToCamelcase("abc_def_gh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでa____b__cがABC() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="ABC";
		String actual=sc.snakeToCamelcase("a____b__c");
		assertThat(actual, is(expected));
	}

	@Test
	public void snakeToCamelcaseで_abc_dがAbcD() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="AbcD";
		String actual=sc.snakeToCamelcase("_abc_d");
		assertThat(actual, is(expected));
	}

	@Test
	public void camelToSnakecaseでAbcがabc() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="abc";
		String actual=sc.camelToSnakecase("Abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでAbCdEfがab_cd_ef() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="ab_cd_ef";
		String actual=sc.camelToSnakecase("AbCdEf");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでABcdEfGがa_bcd_ef_g() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="a_bcd_ef_g";
		String actual=sc.camelToSnakecase("ABcdEfG");
		assertThat(actual, is(expected));
	}

	@Test
	public void capitalizeで空文字が空文字() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected=" ";
		String actual=sc.capitalize(" ");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでaがA() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="A";
		String actual=sc.capitalize("a");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでabcがAbc() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="Abc";
		String actual=sc.capitalize("abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeで空文字が空文字() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected=" ";
		String actual=sc.uncapitalize(" ");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeでAがa() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="a";
		String actual=sc.uncapitalize("A");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeでAbcがabc() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="abc";
		String actual=sc.uncapitalize("Abc");
		assertThat(actual, is(expected));
	}
	
	
}
