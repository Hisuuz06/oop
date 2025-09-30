// Test cases for CharGrid -- a few basic tests are provided.

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CharGridTest {
    @Test
    public void testCharArea1() {
        char[][] grid = new char[][]{
                {'a', 'y', ' '},
                {'x', 'a', 'z'},
        };

        CharGrid cg = new CharGrid(grid);

        assertEquals(4, cg.charArea('a'));
        assertEquals(1, cg.charArea('z'));
    }

    @Test
    public void testCharArea2() {
        char[][] grid = new char[][]{
                {'c', 'a', ' '},
                {'b', ' ', 'b'},
                {' ', ' ', 'a'}
        };

        CharGrid cg = new CharGrid(grid);

        assertEquals(6, cg.charArea('a'));
        assertEquals(3, cg.charArea('b'));
        assertEquals(1, cg.charArea('c'));
    }

    @Test
    public void testCountPlus1() {
        char[][] grid = new char[][]{
                {'c', 'b', ' '},
                {'b', 'b', 'b'},
                {' ', 'b', 'a'}
        };
        CharGrid cg = new CharGrid(grid);
        assertEquals(1,cg.countPlus());
    }

    @Test
    public void testCountPlus2() {
        char[][] grid = new char[][]{
                {'c', 'b', ' ','z','z','r','m','m'},
                {'b', 'b', 'b','r','r','r','v','v'},
                {' ', 'b', 'a','r','r','r','r','r'},
                {'c', 'f', 'b','z','z','r','r','m'},
                {'b', 'b', 'b','r','r','r','v','v'},
                {' ', 'b', 'a','r','r','r','r','r'}
        };
        CharGrid cg = new CharGrid(grid);
        assertEquals(1,cg.countPlus());
    }


}
