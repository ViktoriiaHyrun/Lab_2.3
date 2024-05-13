import java.util.Scanner;

class MyLabs {
    public static void main(String[] args) throws java.lang.Exception {
        int n = 0;
        int i = 0;
        int s = 0;
        
        System.out.println("Please enter value for N\n");
        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
        }

        s = 0;
        for (i = 1; i <= n; i += 1) {
            if (i % 2 == 0) {
                s = s + i;
                System.out.println("Current value i=" + i + " S=" + s + "\n");
            }
        }
        System.out.println("Final result suma is S=" + s);
    }
}

