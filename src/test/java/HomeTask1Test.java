import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * class for testing MirArrayList methods
 */
public class HomeTask1Test {


    @BeforeAll
    public static void setUpBeforeClass(){
        System.out.println("Before class method was called!");
    }

    /**
     * testing size() method
     */
    @Test
    public void testSizeMirArrayList(){
        // given
        MirArrayList mirArrayList = new MirArrayList();

        // when
        mirArrayList.add(1);
        mirArrayList.add(2);
        mirArrayList.add(3);

        // then
        assertEquals(mirArrayList.size(),3,"Size of ArrayList is incorrect");
    }

    /**
     * testing add() method
     */
    @Test
    public void testAddMirArrayList() {
        // given
        MirArrayList mirArrayList = new MirArrayList();

        // when
        mirArrayList.add(1);

        //then
        assertEquals(mirArrayList.get(0),1,"Element was added incorrectly");
    }

    /**
     * testing remove() method
     */
    @Test
    public void testRemoveMirArrayList() {
        // given
        MirArrayList mirArrayList = new MirArrayList();

        // when
        mirArrayList.add(1);
        mirArrayList.remove(1);

        //then
        assertEquals(mirArrayList.size(),0,"Element was deleted incorrectly");
    }

    /**
     * testing get() method
     */
    @Test
    public void testGetMirArrayList() {
        // given
        MirArrayList mirArrayList = new MirArrayList();

        // when
        mirArrayList.add(1);

        //then
        assertEquals(mirArrayList.get(0),1,"Element got incorrectly");
    }

    /**
     * testing getAll() mehod
     */
    @Test
    public void testgetAllMirArrayList(){
        // given
        MirArrayList mirArrayList = new MirArrayList();

        // when
        mirArrayList.add(1);
        mirArrayList.add(2);
        mirArrayList.add(3);

        //Basic Size of user MirArrayList = 8
        Object[] checkArray={1,2,3,null,null,null,null,null};

        //then
        assertArrayEquals(mirArrayList.getAll(),checkArray,"Arrays should be equal");

    }




}
