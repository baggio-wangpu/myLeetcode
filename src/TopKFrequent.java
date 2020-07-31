import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> frequency = new HashMap<>();
    for (int n : nums) {
      frequency.put(n, frequency.getOrDefault(n, 0) + 1);
    }

    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparing(frequency::get));
    for (Integer i : frequency.keySet()) {
      pq.offer(i);
      if (pq.size() > k) pq.poll();
    }

    int[] result = new int[k];
    while (k > 0) {
      k--;
      result[k] = pq.poll();
    }
    return result;
  }
}
