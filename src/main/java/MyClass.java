import java.math.BigInteger;

public class MyClass {
    public static void main(String args[]) {
        System.out.println("last ten digits of the series :" + lastTenDigits(1000));
    }

    public static String lastTenDigits(int number){
        BigInteger series = BigInteger.ZERO;

        if (number >= 0) {
            for (int i = 0; i <= number; i++) {
                series = series.add(BigInteger.valueOf(i).pow(i));
            }
        } else {
            for (int i = 0; i >= number; i--) {
                BigInteger value = BigInteger.ONE.divide(BigInteger.valueOf(-i).pow(-i));
                if (i != 0) {
                    value = value.negate();
                }
                series = series.add(value);
            }
        }

        String lastTenDigits = series.toString();

        if (lastTenDigits.length() < 10) throw new RuntimeException("El resultado no tiene 10 digitos: " + lastTenDigits);

        return lastTenDigits.substring(lastTenDigits.length() - 10);
    }
}