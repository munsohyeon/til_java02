package starcraft;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class DropshipTest {
    Dropship dropship =new Dropship();

    @Test
    @DisplayName("드랍십 3명 태우기")
    public void test1() {

        final int createdUnitCount = 3;
        for(int i=0; i<createdUnitCount; i++) {
            dropship.load(new Marine());
        }
        int loadedCount = 0;
        for(GroundUnit unit : dropship.units) {
            if(unit != null) {
                loadedCount++;
            }
            System.out.printf("%d. %s\n", loadedCount, unit);
        }
        System.out.println("loadedCount: " + loadedCount);


        //첫번째 인자는 기대하는 값 expected value
        //두번째 인자는 실제처리된 값 actual value
        assertEquals(createdUnitCount, loadedCount);
        assertEquals(createdUnitCount, dropship.loadedIndex);
    }

    @Test
    @DisplayName("가득 태웠다가 2명 떨구기")
    public void test2() {

        for(int i=0; i<dropship.units.length; i++) {
            dropship.load(new Marine());
        }
        for(GroundUnit gu : dropship.units) {
            assertNotNull(gu);
        }

        boolean result = dropship.load(new Marine());
        assertEquals(false, result);

        GroundUnit gu = dropship.unload();
        assertNotNull(gu);
        assertNull(dropship.units[dropship.units.length - 1]);
        assertEquals(7, dropship.loadedIndex);

        GroundUnit gu2 = dropship.unload();
        assertNotNull(gu2);
        assertNull(dropship.units[dropship.units.length - 2]);
        assertEquals(6, dropship.loadedIndex);

        assertNotEquals(gu, gu2);
    }

    @Test
    @DisplayName("한 명도 태우지 않고 unload 시키기")
    public void test3() {
        GroundUnit gu = dropship.unload();
        assertNull(gu);
        assertEquals(0, dropship.loadedIndex);
    }







}