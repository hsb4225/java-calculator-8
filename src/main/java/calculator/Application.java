package calculator;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        AddString addString = new AddString();
        StringSplitter stringSplitter = new StringSplitter();
        IntConverter intConverter = new IntConverter();

        System.out.println("덧셈할 문자열을 입력하세요: ");
        String inputString = Console.readLine();
        inputString = inputString.replace("\\n", "\n");

        String[] strings = stringSplitter.split(inputString);
        int[] numbers = intConverter.intConvert(strings);
        int result = addString.sum(numbers);

        System.out.println("결과: " + result);
    }
}

