import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Stack;

public class RomanToInteger {

    /*
    public int romanToInt(String s) {

        if(s == null || s.isEmpty()) {
            return 0;
        }

        Stack<Character> stack = new Stack<>();
        int index = 0;
        int result = 0;

        while(index < s.length()) {
            char c = s.charAt(index);
            char curr;
            if(!stack.empty()) {
                curr = stack.pop();
            } else {
                stack.push(c);
                index++;
                continue;
            }

            if(basicRomanToInt(c) > basicRomanToInt(curr)) {
                result += basicRomanToInt(c) - basicRomanToInt(curr);
            } else {
                stack.push(curr);
                stack.push(c);
            }
            index++;
        }

        while(!stack.empty()) {
            result += basicRomanToInt(stack.pop());
        }
        return result;
    }

    private int basicRomanToInt(Character c) {
        int result = 0;
        switch (c) {
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
            default:
                break;
        }
        return result;
    }
    */

    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1));

        for(int i = s.length() - 2; i >= 0; i--) {
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                result += map.get(s.charAt(i));
            } else {
                result -= map.get(s.charAt(i));
            }
        }
        return result;
    }
}
