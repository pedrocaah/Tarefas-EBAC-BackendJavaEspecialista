package calculadora;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculadoraTest {

    final Calculadora calculadora = new Calculadora();
    final double delta = 0.0;

    @Test
    public void testCalculadoraSoma() {

        double soma = calculadora.soma(5, 5);
        assertEquals(10, soma, delta);
        assertNotEquals(5, soma, delta);
    }
    @Test
    public void testCalculadoraSubtracao() {

        double subtracao = calculadora.subtrai(5, 5);
        assertEquals(0, subtracao, delta);
        assertNotEquals(5, subtracao, delta);
    }
    @Test
    public void testCalculadoraMultiplicacao() {

        double multiplicacao = calculadora.multiplicacao(5, 5);
        assertEquals(25, multiplicacao, delta);
        assertNotEquals(5, multiplicacao, delta);
    }
    @Test
    public void testCalculadoraDivisao() {

        double divisao = calculadora.divisao(10, 2);
        assertEquals(5, divisao, delta);
        assertNotEquals(10, divisao, delta);
    }
}
