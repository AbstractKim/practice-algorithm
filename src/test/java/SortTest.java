import com.github.actractkim.practice.algorithm.BubbleSort;
import com.github.actractkim.practice.algorithm.InsertionSort;
import com.github.actractkim.practice.algorithm.SelectionSort;
import com.github.actractkim.practice.algorithm.Sort;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


public class SortTest {

    int input[] = new int[] { 5,7,8,9,10,4,2,3,1,6};
    int expectResult[] = new int[] {1,2,3,4,5,6,7,8,9,10};

    @Test
    public void sort() {
//        Sort sort = new SelectionSort();
//        Sort sort = new BubbleSort();
        Sort sort = new InsertionSort();
        sort.sort(input);
        assertThat(input).isEqualTo(expectResult);
    }
}