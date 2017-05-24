/*
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */
package maxindex

fun indexOfMax(a: IntArray): Int? {
    return if(a.isEmpty()) null else a.indices.reduce({curr, next ->
		if(a[next] >= a[curr]) next else curr
	})
}
