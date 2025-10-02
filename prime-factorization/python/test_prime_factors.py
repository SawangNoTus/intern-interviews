import unittest
from prime_factors import prime_factors


class TestPrimeFactors(unittest.TestCase):

    def test_numbers_less_than_2(self):
        """ทดสอบเลขที่น้อยกว่า 2"""
        self.assertEqual(prime_factors(1), [])
        self.assertEqual(prime_factors(0), [])
        self.assertEqual(prime_factors(-5), [])

    def test_number_2(self):
        """ทดสอบเลข 2"""
        self.assertEqual(prime_factors(2), [2])

    def test_number_3(self):
        """ทดสอบเลข 3"""
        self.assertEqual(prime_factors(3), [3])

    def test_number_4(self):
        """ทดสอบเลข 4"""
        self.assertEqual(prime_factors(4), [2, 2])

    def test_number_6(self):
        """ทดสอบเลข 6"""
        self.assertEqual(prime_factors(6), [2, 3])

    def test_number_8(self):
        """ทดสอบเลข 8"""
        self.assertEqual(prime_factors(8), [2, 2, 2])

    def test_number_9(self):
        """ทดสอบเลข 9"""
        self.assertEqual(prime_factors(9), [3, 3])

    def test_number_12(self):
        """ทดสอบเลข 12"""
        self.assertEqual(prime_factors(12), [2, 2, 3])

    def test_number_30(self):
        """ทดสอบเลข 30"""
        self.assertEqual(prime_factors(30), [2, 3, 5])

    def test_number_100(self):
        """ทดสอบเลข 100"""
        self.assertEqual(prime_factors(100), [2, 2, 5, 5])

    def test_prime_number_97(self):
        """ทดสอบจำนวนเฉพาะ 97"""
        self.assertEqual(prime_factors(97), [97])


if __name__ == '__main__':
    unittest.main(verbosity=2)
