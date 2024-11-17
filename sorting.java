public static String[] sortStrings(String[] strings) {
    Arrays.sort(strings);
    return strings;
}

public static void main(String[] args) {
    // Test string sorting
    String[] stringArray = {"banana", "apple", "orange", "grape"};
    System.out.println("Original String Array: " + Arrays.toString(stringArray));
    stringArray = sortStrings(stringArray);
    System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
}
