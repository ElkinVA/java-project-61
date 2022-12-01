package hexlet.code.games;

public class Prime {

    public static String primeNum() {
        String answerYesNo = "";
        final int range = 100;
        int number = (int) (Math.random() * range) + 2;
        if (isPrime(number)) {
            answerYesNo = "yes";
        } else {
            answerYesNo = "no";
        }
        System.out.print("Answer 'yes' if given number is prime. Otherwise answer 'no'.\nQuestion: " + number);
        return answerYesNo;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        var divider = 2;
        while (divider <= number / 2) {
            if (number % divider == 0) {
                return false;
            }
            divider += 1;
        }
        return true;
    }
}
