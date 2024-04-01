package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void CalcInit() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testar a soma de dois números inteiros")
	@Test
	public void TestSum() {
		int soma = calc.soma(10, 5);		
		Assertions.assertEquals(15, soma);		
	}

	@DisplayName("Testar a divisão entre dois números inteiros")
	@Test
	public void TestDivision() {
		int divisao = calc.divisao(24, 4);
		assertTrue(divisao == 6);
	}

	@DisplayName("Testar a multiplicação entre dois números inteiros")
	@Test
	public void TestMult() {
		int mult = calc.multiplicacao(4, 4);
		assertTrue(mult == 16);
	}

	@DisplayName("Testar o somatório")
    @Test
    public void somatorio() {
        int result = calc.somatoria(9);
        assertEquals(45, result);
    }
  @Test
    public void numeropositivo() {
        boolean result= calc.ehPositivo(12);
        assertTrue(result);
        
    }

    @Test
    public void numeronegativo() {
        boolean result= calc.ehPositivo(-15);
        assertFalse(result);
        
    }

    @Test
    public void compara2numeros() {
        int result = calc.compara(100, 100);
        assertEquals(0, result);
    }
	


}
