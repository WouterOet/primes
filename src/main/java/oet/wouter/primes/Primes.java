package oet.wouter.primes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Primes {

    public static int[] get() {
        try {
            String primes = new String(Files.readAllBytes(Paths.get("src/main/resources/primes.txt")));
            String[] split = primes.split(",");
            return Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
