package calculator;

import calculator.separator.Separator;

import java.util.List;

public class Calculator {

    private final Separator separator;

    public Calculator(Separator separator) {
        this.separator = separator;
    }

    public int calculate() {
        String[] strings = separator.splitLine();
        List<Integer> numbers = Converter.convert(strings);     // 숫자가 0일 때에는 여기서 처리하는게 좋지 않을까?
        return Aggregator.add(numbers);
    }
}
