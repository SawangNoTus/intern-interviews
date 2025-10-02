public class TestRunner {

    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        System.out.println("Running Prime Number Tests...\n");

        // Test numbers less than 2
        test("isPrime(1)", false, IsPrime.isPrime(1));
        test("isPrime(0)", false, IsPrime.isPrime(0));
        test("isPrime(-5)", false, IsPrime.isPrime(-5));

        // Test number 2
        test("isPrime(2)", true, IsPrime.isPrime(2));

        // Test small prime numbers
        test("isPrime(3)", true, IsPrime.isPrime(3));
        test("isPrime(5)", true, IsPrime.isPrime(5));
        test("isPrime(7)", true, IsPrime.isPrime(7));
        test("isPrime(11)", true, IsPrime.isPrime(11));

        // Test small non-prime numbers
        test("isPrime(4)", false, IsPrime.isPrime(4));
        test("isPrime(6)", false, IsPrime.isPrime(6));
        test("isPrime(8)", false, IsPrime.isPrime(8));
        test("isPrime(9)", false, IsPrime.isPrime(9));

        // Test larger prime numbers
        test("isPrime(13)", true, IsPrime.isPrime(13));
        test("isPrime(17)", true, IsPrime.isPrime(17));
        test("isPrime(97)", true, IsPrime.isPrime(97));

        // Test larger non-prime numbers
        test("isPrime(100)", false, IsPrime.isPrime(100));
        test("isPrime(121)", false, IsPrime.isPrime(121));

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

    private static void test(String testName, boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("✓ PASS: " + testName + " = " + actual);
            passed++;
        } else {
            System.out.println("✗ FAIL: " + testName + " (expected: " + expected + ", got: " + actual + ")");
            failed++;
        }
    }
}
