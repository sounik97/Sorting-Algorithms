/**
 *
 *
 * @param <T> T is a generic comparable type (Integer for exemple)
 *
 * The Three way quicksort it is an optimized version of traditional quicksort
 * this one deals better with several occurrences of elements equal to the pivot.
</T> */

class ThreeWayQuickSort<T : Comparable<T>> {

    /** The main method.
     *
     * @param array a generic collection to be sorted.
     * @param left  the begin of the order.
     * @param right the end of the order.
     */

    fun sort(array: Array<T>, left: Int, right: Int) {

        if (left < right) this.partition(array, left, right)

    }

    /** The partition of array method.
     *
     * @param array a generic collection to partition.
     * @param left the begin of partition.
     * @param right the end of partition.
     */

    private fun partition(array: Array<T>, left: Int, right: Int) {

        if (left < right) {

            var start = left
            var end = right
            var i = left
            val pivot = array[left]

            while (i <= end) {

                if (array[i].compareTo(pivot) < 0) {

                    this.swap(array, start, i)
                    start++
                    i++

                } else if (array[i].compareTo(pivot) > 0) {

                    this.swap(array, i, end)
                    end--

                } else
                    i++

            }

            sort(array, left, start - 1)
            sort(array, end + 1, right)

        }
    }

    /**
     * The swap method.
     *
     * @param array a generic collection.
     * @param i the index of the element that will be swapped with the j-element.
     * @param j the index of the element that will be swapped with de i-element.
     */

    private fun swap(array: Array<T>, i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}
