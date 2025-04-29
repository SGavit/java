package generic;

class GenericSorting
{
    public static void main(String[] args) {
        Integer[] a = { 100, 22, 58, 41, 6, 50 };
        System.out.println("Sorted Integer array:  ");
        sort_generics(a);

    }
    public static <T extends Comparable<T> > void sort_generics(T[] a)
    {
        for(int i= 0;i<a.length-1;i++)
        {
            for(int j = 0; j < a.length-i-1;j++) {

                if (a[j].compareTo(a[j + 1]) > 0) {

                    swap(j, j + 1, a);
                }
            }

        }
        // Printing the elements after sorted
        for (T i : a)
        {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
    public static <T> void swap(int i, int j, T[] a)
    {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
