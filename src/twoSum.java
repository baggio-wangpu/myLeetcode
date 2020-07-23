import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

    ArrayList<Integer> IDsOfSongs(int rideDuration,
                                  ArrayList<Integer> songDurations)
    {
        // WRITE YOUR CODE HERE
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int index = 0; index < songDurations.size(); index++) {
            if(map.containsKey(rideDuration - 30 - songDurations.get(index))) {
                list.add(index);
                list.add(map.get(rideDuration - 30 - songDurations.get(index)));
                return list;
            }
            map.put(songDurations.get(index), index);
        }
        return list;
    }
}
