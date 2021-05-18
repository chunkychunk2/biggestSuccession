import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;
import java.io.IOException;
import java.io.*;

/*
Cамая длинная последовательность
*/

public class test {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> numbers = new ArrayList<>();
        List<Integer> bNumbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(reader.readLine());
            numbers.add(n);
        }
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i; j < numbers.size(); j++) {
                if (numbers.get(j).equals(numbers.get(i))) {
                    count++;
                } else break;
            }
            bNumbers.add(count);
            count = 0;
        }
        int max = bNumbers.get(0);
        for (int x : bNumbers) {
            if (x > max)
                max = x;
        }
        System.out.println(max);
    }
}
