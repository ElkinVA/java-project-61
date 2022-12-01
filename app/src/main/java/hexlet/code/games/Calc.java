package hexlet.code.games;

public final class Calc {
    @SuppressWarnings("checkstyle:LineLength")
    public static int calculateTwoNumber() {
        int result = 0;
        final int firstNumberRange = 100;
        final int secondNumberRange = 100;
        final int randomSign = 3;
        var resultMessage = "What is the result of the expression?\nQuestion: ";
        int firstRandomNumber = (int) (Math.random() * firstNumberRange);
        int secondRandomNumber = (int) (Math.random() * secondNumberRange);
        int signRandomRange = (int) (Math.random() * randomSign);
        switch (signRandomRange) {
            case 0 -> {
                result = firstRandomNumber + secondRandomNumber;
                System.out.println(resultMessage + firstRandomNumber + " + " + secondRandomNumber);
            }
            case 1 -> {
                result = firstRandomNumber - secondRandomNumber;
                System.out.println(resultMessage + firstRandomNumber + " - " + secondRandomNumber);
            }
            case 2 -> {
                result = firstRandomNumber * secondRandomNumber;
                System.out.println(resultMessage + firstRandomNumber + " * " + secondRandomNumber);
            }
            default -> System.out.println("People's! Choice!");
        }
        return result;
    }
}
