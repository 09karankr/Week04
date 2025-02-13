package listinterface.findfrequency;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyOfElementTest {

    List<String> strings;
    @BeforeEach
    void setUp(){
        strings = new ArrayList<>();
        strings.add("karan");
        strings.add("vivek");
        strings.add("vivek");
        strings.add("karan");
        strings.add("vivek");
    }
    @Test
    void frequencyCalculator() {
        Map<String, Integer> map = FrequencyOfElements.frequencyCalculator(strings);
        int vivekFreq = map.get("vivek");
        assertEquals(3,vivekFreq,"Function not working ");
        System.out.println("Test Passed !!!");
    }
}