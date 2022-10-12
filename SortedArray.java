public class SortedArray {
    // takes two sorted array a,b and return sorted array c
    public int[] sort(int[] a, int[] b) {
        int p1 = 0;
        int p2 = 0;
        int r = 0;
        int[] c = new int[a.length + b.length];
        while (p1 < a.length && p2 < b.length) {
            if (a[p1] <= b[p2]) {
                c[r] = a[p1];
                p1++;
            } else {
                c[r] = b[p2];
                p2++;
            }
            r++;
        }
        // when array a is bigger than b
        while (p1 < a.length) {
            c[r] = a[p1];
            p1++;
            r++;
        }
        // when array b is bigger than a
        while (p2 < b.length) {
            c[r] = b[p2];
            p2++;
            r++;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 7, 11 };
        int[] b = { 3, 7, 13, 16, 29 };

        SortedArray sorting = new SortedArray();
        int[] c = new int[a.length + b.length];
        c = sorting.sort(a, b);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
