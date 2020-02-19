package lecture4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testMinCharacterString {

	@Test
	void test() {
		MinCharacterString x= new MinCharacterString();
		String y= "akel";
		char z= x.minChar(y);
		char expe= 'a';
		assertEquals(z,expe);
		
	}

}
