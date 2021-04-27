package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import mx.tec.lab.OddAndEvenEvaluator;

public class OddAndEvenEvaluatorTest {
  OddAndEvenEvaluator evaluator = new OddAndEvenEvaluator();

  @Test
  public void givenA2B2WhenEvaluateThenCEvenDEven(){
    // Given
		double a = 2;
		double b = 2;
		// When
		String result = evaluator.evaluate(a, b);
		// Then
		assertEquals("C is even and D is even, c=4.0 and d=0.0", result);
  }
}