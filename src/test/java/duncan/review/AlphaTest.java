package duncan.review;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;

@DisplayName("This is the Alpha Test")
class AlphaTest {
	int a;
	int b;
	
	@BeforeEach
	void setup() {
		a = 1;
		b = 2;
	}

	@Test
	@DisplayName("This is adding two numbers")
	void addNumbers() {
		int result = a + b;

		assertEquals(3, result, "The addition result should be 3");
	}
}