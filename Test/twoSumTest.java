import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class twoSumTest {

    @Test
    public void IDsOfSongs() {
        twoSum utils = new twoSum();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(60);
        list.add(90);
        list.add(30);
        list.add(70);
        list.add(110);
        System.out.println(utils.IDsOfSongs(110, list));
    }
}