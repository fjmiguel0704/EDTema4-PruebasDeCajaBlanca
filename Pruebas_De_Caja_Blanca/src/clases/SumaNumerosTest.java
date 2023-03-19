package clases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SumaNumerosTest {

	@ParameterizedTest
	@MethodSource("sumaNumeros")
	void testSumaNumeros(int num, int expected) {
		SumaNumeros suma = new SumaNumeros ();
		
		int resultado = suma.sumaNumeros(num);
		
		assertEquals(expected, resultado);
	}
	
	private static Stream <Arguments> sumaNumeros (){
		return Stream.of(
				Arguments.of(0, 0),
				Arguments.of(3, 2),
				Arguments.of(2, 2),
				Arguments.of(8, 20)
				);
	}

}
