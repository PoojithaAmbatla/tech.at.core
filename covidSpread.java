import java.util.Scanner;

public class covidSpread {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] positions = new int[N];


            for (int i = 0; i < N; i++) {
                positions[i] = scanner.nextInt();
            }


            int minInfected = 1;
            int maxInfected = 1;
            for (int i = 0; i < N-1; i++) {
                if (positions[i + 1] - positions[i] <= 2) {
                    maxInfected++;
                } else {
                    minInfected = maxInfected = 1;
                }
            }


            System.out.println(minInfected + " " + maxInfected);
            scanner.close();
        } 
    }
}