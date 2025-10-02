import unittest
from is_prime import is_prime


class TestIsPrime(unittest.TestCase):

    def test_numbers_less_than_2(self):
        """ทดสอบเลขที่น้อยกว่า 2"""
        self.assertFalse(is_prime(1))
        self.assertFalse(is_prime(0))
        self.assertFalse(is_prime(-5))

    def test_number_2(self):
        """ทดสอบเลข 2"""
        self.assertTrue(is_prime(2))

    def test_small_prime_numbers(self):
        """ทดสอบจำนวนเฉพาะขนาดเล็ก"""
        self.assertTrue(is_prime(3))
        self.assertTrue(is_prime(5))
        self.assertTrue(is_prime(7))
        self.assertTrue(is_prime(11))

    def test_small_non_prime_numbers(self):
        """ทดสอบจำนวนที่ไม่ใช่เฉพาะขนาดเล็ก"""
        self.assertFalse(is_prime(4))
        self.assertFalse(is_prime(6))
        self.assertFalse(is_prime(8))
        self.assertFalse(is_prime(9))

    def test_larger_prime_numbers(self):
        """ทดสอบจำนวนเฉพาะขนาดใหญ่"""
        self.assertTrue(is_prime(13))
        self.assertTrue(is_prime(17))
        self.assertTrue(is_prime(97))

    def test_larger_non_prime_numbers(self):
        """ทดสอบจำนวนที่ไม่ใช่เฉพาะขนาดใหญ่"""
        self.assertFalse(is_prime(100))
        self.assertFalse(is_prime(121))


if __name__ == '__main__':
    unittest.main()
