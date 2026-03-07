class Duplicate {
    public static void main(String[] args) {
        int a[] = {12,23,12,56,47,23,78};
        System.out.println("Array is: ");
        for (int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Duplicate elements are: ");
        for (int i = 0; i < a.length; i++){
            for (int j = i+1; j< a.length; j++){
                if (a[i] == a[j]){
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }

    }
}

// Array is: 
// 12 23 12 56 47 23 78 
// Duplicate elements are: 
// 12 23 