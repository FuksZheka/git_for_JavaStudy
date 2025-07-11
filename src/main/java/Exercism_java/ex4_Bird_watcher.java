package Exercism_java;

/*Ex3_Introduction
Arrays

In Java, arrays are a way to store multiple values of the same type in a single structure. Unlike other data structures, arrays have a fixed size once created. Elements can be assigned to an array or retrieved from it using an index. Java arrays use zero-based indexing: the first element's index is 0, the second element's index is 1, etc.

Here is the standard syntax for initializing an array:

type[] variableName = new type[size];

The type is the type of elements in the array which may be a primitive type (e.g. int) or a class (e.g. String).

The size is the number of elements this array will hold (which cannot be changed later). After array creation, the elements are initialized to their default values (typically 0, false or null).

// Declare array with explicit size (size is 2)
int[] twoInts = new int[2];

Arrays can also be defined using a shortcut notation that allows you to both create the array and set its value:

// Two equivalent ways to declare and initialize an array (size is 3)
int[] threeIntsV1 = new int[] { 4, 9, 7 };
int[] threeIntsV2 = { 4, 9, 7 };

As the compiler can now tell how many elements the array will have, the length can be omitted.

Array elements may be assigned and accessed using a bracketed index notation:

// Assign second element by index
twoInts[1] = 8;

// Retrieve the second element by index and assign to the int element
int secondElement = twoInts[1];

Accessing an index that is outside of the valid indexes for the array results in an IndexOutOfBoundsException.

Arrays can be manipulated by either calling an array instance's methods or properties, or by using the static methods defined in the Arrays class (typically only used in generic code). The length property holds the length of an array. It can be accessed like this:

int arrayLength = someArray.length;

Java also provides a helpful utility class java.util.Arrays that has lots of useful array-related methods (eg. Arrays.equals).

Java also supports multi-dimensional arrays like int[][] arr = new int[3][4]; which can be very useful.

The fact that an array is also a collection means that, besides accessing values by index, you can iterate over all its values using a for-each loop:

char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

for(char vowel: vowels) {
    // Output the vowel
    System.out.print(vowel);
}

// => aeiou

If you want more control over which values to iterate over, a for loop can be used:

char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

for (int i = 0; i < 3; i++) {
    // Output the vowel
    System.out.print(vowels[i]);
}

// => aei

Instructions

You're an avid bird watcher who keeps track of how many birds have visited your garden in the last seven days.

You have six tasks, all dealing with the numbers of birds that visited your garden.
*/
public class ex4_Bird_watcher {
    private final int[] birdsPerDay;

    public ex4_Bird_watcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return this.birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int countOfBirds : this.birdsPerDay) {
            if (countOfBirds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int result = 0;
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        for (int i = 0; i < numberOfDays; i++) {
            result += this.birdsPerDay[i];
        }
        return result;
    }

    public int getBusyDays() {
        int countOfBusyDays = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] >= 5) {
                countOfBusyDays += 1;
            }
        }
        return countOfBusyDays;
    }

    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        ex4_Bird_watcher birdCount = new ex4_Bird_watcher(birdsPerDay);
//        birdCount.incrementTodaysCount();
//        System.out.println(birdCount.getToday());
        System.out.println(birdCount.getBusyDays());
        ;
// => 2
    }
}
