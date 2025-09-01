import java.util.Random;
import java.util.stream.IntStream;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RollDie {

   public static void main(String[] args) {
      final int totalRolls = 600_000_000;
      Random random = new Random();

      // Use IntStream to simulate die rolls
      Map<Integer, Long> frequencyMap = IntStream.range(0, totalRolls)
         .parallel()
         .map(i -> 1 + random.nextInt(6))
         .boxed()
         .collect(Collectors.groupingBy(
            Function.identity(), 
            Collectors.counting()
         ));

      // Print the results
      System.out.printf("%-5s%-10s%n", "Face", "Frequency");
      frequencyMap.forEach((face, frequency) ->
         System.out.printf("%-5d%-10d%n", face, frequency));
   }
}