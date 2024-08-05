package third;

public class EvenOdd {
	private int arr[];

    public EvenOdd(int array[]) {
        this.arr = array;
    }

    public void checkEvenOdd() {
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
    }

    public int sumOddNumbers() {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

}
