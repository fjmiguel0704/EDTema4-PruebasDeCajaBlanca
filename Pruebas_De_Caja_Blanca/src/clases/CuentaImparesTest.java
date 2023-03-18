package clases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CuentaImparesTest {

	@ParameterizedTest
	@MethodSource("sumaImpares")
	void testCuentaImpares(int num, int expected) {
		CuentaImpares impares = new CuentaImpares();
		
		int resultado = impares.cuentaImpares(num);
		
		assertEquals(expected, resultado);
	}
	
	private static Stream <Arguments> sumaImpares (){
		return Stream.of(
				Arguments.of(0, 0),
				Arguments.of(3, 1),
				Arguments.of(2, 1),
				Arguments.of(1, 0)
				);
	}

}