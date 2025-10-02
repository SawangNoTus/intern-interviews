const isPrime = require('./isPrime');

describe('isPrime', () => {
  test('should return false for numbers less than 2', () => {
    expect(isPrime(1)).toBe(false);
    expect(isPrime(0)).toBe(false);
    expect(isPrime(-5)).toBe(false);
  });

  test('should return true for 2', () => {
    expect(isPrime(2)).toBe(true);
  });

  test('should return true for small prime numbers', () => {
    expect(isPrime(3)).toBe(true);
    expect(isPrime(5)).toBe(true);
    expect(isPrime(7)).toBe(true);
    expect(isPrime(11)).toBe(true);
  });

  test('should return false for small non-prime numbers', () => {
    expect(isPrime(4)).toBe(false);
    expect(isPrime(6)).toBe(false);
    expect(isPrime(8)).toBe(false);
    expect(isPrime(9)).toBe(false);
  });

  test('should return true for larger prime numbers', () => {
    expect(isPrime(13)).toBe(true);
    expect(isPrime(17)).toBe(true);
    expect(isPrime(97)).toBe(true);
  });

  test('should return false for larger non-prime numbers', () => {
    expect(isPrime(100)).toBe(false);
    expect(isPrime(121)).toBe(false);
  });
});
