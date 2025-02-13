package mapinterface.keywithhighestvalue;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class KeyWithTheHighestValueTest {
    public static String findMaxValueKey(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
    @Test
    public void testFindMaxValueKey() {
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("A", 10);
        testMap.put("B", 20);
        testMap.put("C", 15);

        assertEquals("B", findMaxValueKey(testMap));
    }
}