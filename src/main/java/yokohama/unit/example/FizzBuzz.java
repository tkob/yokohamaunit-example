package yokohama.unit.example;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public List<String> generate(int size) {
        String[] a = new String[size];
        for (int i = 0; i < size; i++) {
            int j = i + 1;
            if (j % 15 == 0) {
                a[i] = "FizzBuzz";
            } else if (j % 3 == 0) {
                a[i] = "Fizz";
            } else if (j % 5 == 0) {
                a[i] = "Buzz";
            } else {
                a[i] = Integer.toString(j);
            }
        }
        return Arrays.asList(a);
    }
}
