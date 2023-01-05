package JavaCourse.Seminar5;

import java.util.HashMap;
import java.util.Map;

/*
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. 
Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. 
(Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true
 */

public class task1 {
    public static void main(String[] args) {
        System.out.println(checkIsomorph("add", "egg"));
        System.out.println(checkIsomorph("foo", "bar"));
        System.out.println(checkIsomorph("paper", "title"));
        System.out.println(checkIsomorph("aab", "baa"));
        System.out.println(checkIsomorph("test", "sest"));
    }

    public static boolean checkIsomorph(String s1, String s2) {
        Map<Character, Integer> s1Map = getCounts(s1);
        Map<Character, Integer> s2Map = getCounts(s2);
        System.out.println(s1Map);
        System.out.println(s2Map);
        System.out.printf("%s %s = ", s1, s2);
        if (s1Map.size() != s2Map.size()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1Map.get(s1.charAt(i)) != s2Map.get(s2.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static Map<Character, Integer> getCounts(String s) {
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(sMap.containsKey(temp)) {
                sMap.put(temp, sMap.get(temp) + 1);
            } else {
                sMap.put(temp, 1);
            }
        }
        return sMap;
    }
}
