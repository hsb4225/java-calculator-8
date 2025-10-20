package calculator;

public class AddString {
    public int sum(int[] numbers) {
        int sumResult = 0;

        for (int number : numbers) {
            sumResult += number;
        }
        return sumResult;
    }
}