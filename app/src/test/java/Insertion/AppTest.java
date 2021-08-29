/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Insertion;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AppTest {
    // {} , {x} , {x,y} , {x,z,y,z,x} , {x,-x,y} {sorted}

    @Test
    void insertionTwoElement() {
        int[] arr = { 1,0};
        assertEquals(new int[]{0, 1},Insertion.sort(arr));
    }
    @Test
    void insertionOneElement() {
        int[] arr = { 0};
        assertEquals(new int[]{0},Insertion.sort(arr));
    }
    @Test
    void insertionDuplicateElement() {
        int[] arr = { 2,1,1,3,3,2};
        assertEquals(new int[]{1,1,2,2,3,3},Insertion.sort(arr));
    }
    @Test
    void insertionIsEmpty() {
        int[] arr = {};
        assertEquals(new int[]{},Insertion.sort(arr));

    }
    @Test
    void insertionIsNegativeVal() {
        int[] arr = { -1,1,-2,2,3};
        assertEquals(new int[]{-2,-1,1,2,3},Insertion.sort(arr));

    }
    @Test
    void insertionIsSorted() {
        int[] arr = { 1,2,3};
        assertEquals(new int[]{1,2,3},Insertion.sort(arr));

    }

}
