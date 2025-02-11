package calculator;

import java.util.ArrayList;
import java.util.List;

public class Converter {

    public static List<Integer> convert(String[] strings) {
        List<Integer> numbers = new ArrayList<>();
        if (strings == null) {
            numbers.add(0);
            return numbers;
        }

        for (String s : strings) {
            isInteger(s);
            Integer num = isPositive(Integer.parseInt(s));
            numbers.add(num);
        }
        return numbers;
    }

    private static Integer isPositive(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("음수를 계산할 수 없습니다.");
        }
        return i;
    }

    private static void isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("정수가 아닌 문자열이 포함되어 있습니다.");
        }
    }
}
