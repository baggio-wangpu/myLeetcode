import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort_451 {

  public String frequencySort(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    PriorityQueue<Character> pq = new PriorityQueue<>(Comparator.comparing(map::get).reversed());

    for (Character c : map.keySet()) {
      pq.offer(c);
    }

    StringBuilder sb = new StringBuilder();

    while (pq.size() > 0) {
      Character c = pq.poll();
      Integer count = map.get(c);
      while (count -- > 0) sb.append(c);
    }

    return sb.toString();
  }

}
