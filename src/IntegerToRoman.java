import java.util.HashMap;

public class IntegerToRoman {

    public String intToRoman(int num) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "I");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        if(map.containsKey(num)) return map.get(num);

        int digit = 0;
        StringBuilder result = new StringBuilder();

        while(num != 0) {
            int i = num % 10;  //个位
            digit++;
            StringBuilder res = new StringBuilder();
            switch (digit) {
                case 1:
                    if(map.containsKey(i)) {
                        result.insert(0, map.get(i));
                    } else {
                        res.append(i / 5 == 1 ? "V" : "");
                        if(i % 5 == 1) {
                            res.append("I");
                        } else if(i % 5 == 2) {
                            res.append("II");
                        } else if(i % 5 == 3) {
                            res.append("III");
                        }
                        result.insert(0, res);
                    }
                    break;
                case 2:
                    if(map.containsKey(i * 10)) {
                        result.insert(0, map.get(i * 10));
                    } else {
                        res.append(i / 5 == 1 ? "L" : "");
                        if(i % 5 == 1) {
                            res.append("X");
                        } else if(i % 5 == 2) {
                            res.append("XX");
                        } else if(i % 5 == 3) {
                            res.append("XXX");
                        }
                        result.insert(0, res);
                    }
                    break;
                case 3:
                    if(map.containsKey(i * 100)) {
                        result.insert(0, map.get(i * 100));
                    } else {
                        res.append(i / 5 == 1 ? "D" : "");
                        if(i % 5 == 1) {
                            res.append("C");
                        } else if(i % 5 == 2) {
                            res.append("CC");
                        } else if(i % 5 == 3) {
                            res.append("CCC");
                        }
                        result.insert(0, res);
                    }
                    break;
                case 4:
                    if(map.containsKey(i * 1000)) {
                        result.insert(0, map.get(i * 1000));
                    } else {
                        if(i % 5 == 1) {
                            res.append("M");
                        } else if(i % 5 == 2) {
                            res.append("MM");
                        } else if(i % 5 == 3) {
                            res.append("MMM");
                        }
                        result.insert(0, res);
                    }
                    break;
            }
            num = num / 10;
        }
        return result.toString();
    }
}
