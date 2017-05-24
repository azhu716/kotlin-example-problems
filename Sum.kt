/*
 * Your task is to implement the sum() function so that it computes the sum of
 * all elements in the given array a.
 */
package sum

fun sum(a: IntArray): Int {
    return if (a.isEmpty()) 0 else a.reduce({total, next -> total + next})
}
