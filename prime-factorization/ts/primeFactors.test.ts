import { primeFactors } from './primeFactors';

describe('primeFactors', () => {
  test('should return empty array for numbers less than 2', () => {
    expect(primeFactors(1)).toEqual([]);
    expect(primeFactors(0)).toEqual([]);
    expect(primeFactors(-5)).toEqual([]);
  });

  test('should return [2] for input 2', () => {
    expect(primeFactors(2)).toEqual([2]);
  });

  test('should return [3] for input 3', () => {
    expect(primeFactors(3)).toEqual([3]);
  });

  test('should return [2, 2] for input 4', () => {
    expect(primeFactors(4)).toEqual([2, 2]);
  });

  test('should return [2, 3] for input 6', () => {
    expect(primeFactors(6)).toEqual([2, 3]);
  });

  test('should return [2, 2, 2] for input 8', () => {
    expect(primeFactors(8)).toEqual([2, 2, 2]);
  });

  test('should return [3, 3] for input 9', () => {
    expect(primeFactors(9)).toEqual([3, 3]);
  });

  test('should return [2, 2, 3] for input 12', () => {
    expect(primeFactors(12)).toEqual([2, 2, 3]);
  });

  test('should return [2, 3, 5] for input 30', () => {
    expect(primeFactors(30)).toEqual([2, 3, 5]);
  });

  test('should return [2, 2, 5, 5] for input 100', () => {
    expect(primeFactors(100)).toEqual([2, 2, 5, 5]);
  });

  test('should return [97] for prime number 97', () => {
    expect(primeFactors(97)).toEqual([97]);
  });
});
