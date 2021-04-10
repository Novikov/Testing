package chapter_3_exercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;


public class HashMapTest {
    HashMap testedMap;
    private final String VALUE = "VALUE";
    private final String KEY = "KEY";

    @Before
    public void setUp(){
        testedMap = new HashMap();
    }

    @After
    public void clear(){
        testedMap.clear();
    }

    @Test
    public void anObjectStoredWithThePutMethodShouldBeRetrievedWithGetMethod(){
        testedMap.put(KEY,VALUE);
        assertEquals(VALUE,testedMap.get(KEY));
    }

    @Test
    public void addingSecondValueWithTheSameKeyShouldReplaceOldValue(){
        testedMap.put(KEY,VALUE);
        testedMap.put(KEY,VALUE);
        assertEquals(VALUE,testedMap.get(KEY));
    }

    @Test
    public void clearMethodShouldRemoveAllContentOfCollection(){
        testedMap.put(KEY,VALUE);
        testedMap.clear();
        assertEquals(0,testedMap.size());
    }

    @Test
    public void nullValueCanBeUsedAsAKeyOfCollection(){
        testedMap.put(null,VALUE);
        assertEquals(VALUE,testedMap.get(null));
    }
}
