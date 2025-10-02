import java.util.Arrays;
import java.util.List;

public class TestRunner {

    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        System.out.println("Running Prime Factorization Tests...\n");

        // Test numbers less than 2
        test("primeFactors(1)", Arrays.asList(), PrimeFactors.primeFactors(1));
        test("primeFactors(0)", Arrays.asList(), PrimeFactors.primeFactors(0));
        test("primeFactors(-5)", Arrays.asList(), PrimeFactors.primeFactors(-5));

        // Test number 2
        test("primeFactors(2)", Arrays.asList(2), PrimeFactors.primeFactors(2));

        // Test number 3
        test("primeFactors(3)", Arrays.asList(3), PrimeFactors.primeFactors(3));

        // Test number 4
        test("primeFactors(4)", Arrays.asList(2, 2), PrimeFactors.primeFactors(4));

        // Test number 6
        test("primeFactors(6)", Arrays.asList(2, 3), PrimeFactors.primeFactors(6));

        // Test number 8
        test("primeFactors(8)", Arrays.asList(2, 2, 2), PrimeFactors.primeFactors(8));

        // Test number 9
        test("primeFactors(9)", Arrays.asList(3, 3), PrimeFactors.primeFactors(9));

        // Test number 12
        test("primeFactors(12)", Arrays.asList(2, 2, 3), PrimeFactors.primeFactors(12));

        // Test number 30
        test("primeFactors(30)", Arrays.asList(2, 3, 5), PrimeFactors.primeFactors(30));

        // Test number 100
        test("primeFactors(100)", Arrays.asList(2, 2, 5, 5), PrimeFactors.primeFactors(100));

        // Test prime number 97
        test("primeFactors(97)", Arrays.asList(97), PrimeFactors.primeFactors(97));

        // Summary
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Test Results:");
        System.out.println("✓ Passed: " + passed);
        if (failed > 0) {
            System.out.println("✗ Failed: " + failed);
        }
        System.out.println("Total: " + (passed + failed));
        System.out.println("=".repeat(50));

        if (failed == 0) {
            System.out.println("\n🎉 All tests passed!");
        } else {
            System.out.println("\n❌ Some tests failed!");
            System.exit(1);
        }
    }

    private static void test(String testName, List<Integer> expected, List<Integer> actual) {
        if (expected.equals(actual)) {
            System.out.println("✓ PASS: " + testName + " = " + actual);
            passed++;
        } else {
            System.out.println("✗ FAIL: " + testName + " (expected: " + expected + ", got: " + actual + ")");
            failed++;
        }
    }
}
