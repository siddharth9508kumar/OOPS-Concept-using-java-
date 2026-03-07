class Common {
    public static void main(String[] args) {
        String a[] = {"python" , "java" , "c++" , "sql" };
        String b[] = {"mysql" , "java" , "oracle", "sql" };
        System.out.println("Common elements are: ");
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j<b.length; j++){
                if (a[i] == b[j]){
                    System.out.print(b[j] + " ");
                }
            }
        }
    }
}

// Common elements are: 
// java sql 