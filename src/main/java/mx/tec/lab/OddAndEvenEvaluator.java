package mx.tec.lab;

public class OddAndEvenEvaluator {
  public String evaluate(final double a, final double b) {
    final double c = a+b;
    final double d = a-b;
    int odd = 0;

    if(a%2 != 0){
      odd++;
    }

    if(b%2 != 0){
      odd++;
    }

    if (odd == 1){
      return "c is odd and d is odd, c=" + c +" and d=" +d;
    } else {
      return "c is even, d even, c=" +c+ " and d=" +d;
    }
  }
}