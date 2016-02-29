package com.aiello.exercise.array;


import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveArrayFromAnotherTest {

    @Test
    public void removeArrayFromAnother() {
        String[] commonArray=new String[]{"common1","common2","common3","common4"};
        String[] notCommonArray=new String[]{"notcommon1","notcommon2","notcommon3"};
        String[] rareArray = new String[]{"rare1", "rare2"};

        // Define the combined array to include length of all three sub-arrays
        String[] combinedArray = new String[commonArray.length + notCommonArray.length + rareArray.length];

        // Copy elements of each array into the combined array
        System.arraycopy(commonArray, 0, combinedArray, 0, commonArray.length);
        System.arraycopy(notCommonArray, 0, combinedArray, commonArray.length, notCommonArray.length);
        System.arraycopy(rareArray, 0, combinedArray, commonArray.length + notCommonArray.length, rareArray.length);

        String[] result = RemoveArrayFromAnother.removeArray(combinedArray, notCommonArray);
        assertThat(result).containsExactly(new String[]{"common1","common2","common3","common4","rare1","rare2"});
    }
}
