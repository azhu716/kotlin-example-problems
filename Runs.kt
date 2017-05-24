/*
 * Any array may be viewed as a number of "runs" of equal numbers.
 * For example, the following array has two runs:
 *   1, 1, 1, 2, 2
 * Three 1's in a row form the first run, and two 2's form the second.
 * This array has two runs of length one:
 *   3, 4
 * And this one has five runs:
 *   1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0
 * Your task is to implement the runs() function so that it returns the number
 * of runs in the given array.
 */	
package runs

fun runs(a: IntArray): Int {
    return if(a.isEmpty()) 0 else a.reduceIndexed({index, runs, curr ->
		if(index == 0)
			1
		else if (curr == a[index-1])
			runs
		else
			runs+1
	})
}