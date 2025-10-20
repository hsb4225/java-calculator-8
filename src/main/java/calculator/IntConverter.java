package calculator;

public class IntConverter {
    public int[] intConvert(String[] inputs) {
        int[] numbers = new int[inputs.length];
        for(int i = 0; i < inputs.length; i++) {
            String input = inputs[i].trim();
            try{ int number = Integer.parseInt(input);
                if(number <0) { throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
                }
                numbers[i] = number; }
            catch (NumberFormatException e) {
                throw new IllegalArgumentException("잘못된 형식입니다."); }
        }
        return numbers;
    }
}
