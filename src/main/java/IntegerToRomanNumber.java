import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class IntegerToRomanNumber {

    public static String convertIntegerToRomanNumber(int integerInput) {

        if (integerInput < 0) {
            return "Error: Negative input";
        }

        if (integerInput > 3999) {
            return "Error: Number out of range";
        }

        if(integerInput ==0 ){
            return "Error: No conversion for 0";
        }

        Map<Integer, String> fixedIntegerValues = new LinkedHashMap<>();
        fixedIntegerValues.put(1000, "M");
        fixedIntegerValues.put(900, "CM");
        fixedIntegerValues.put(500, "D");
        fixedIntegerValues.put(400, "CD");
        fixedIntegerValues.put(100, "C");
        fixedIntegerValues.put(90, "XC");
        fixedIntegerValues.put(50, "L");
        fixedIntegerValues.put(40, "XL");
        fixedIntegerValues.put(10, "X");
        fixedIntegerValues.put(9, "IX");
        fixedIntegerValues.put(5, "V");
        fixedIntegerValues.put(4, "IV");
        fixedIntegerValues.put(1, "I");

        AtomicInteger remainingInput = new AtomicInteger(integerInput);

        return fixedIntegerValues.entrySet().stream()
                .filter(integerEntry -> remainingInput.get() >= integerEntry.getKey())
                .map(entry -> {
                    int count = remainingInput.get() / entry.getKey();
                    remainingInput.updateAndGet(v -> v % entry.getKey());
                    return entry.getValue().repeat(count);
                })
                .collect(Collectors.joining());
    }
}
