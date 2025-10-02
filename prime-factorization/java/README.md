# Prime Factorization - Java

## โจทย์
เขียนเมธอด `public static List<Integer> primeFactors(int num)` ที่รับตัวเลข 1 ตัว และ return List ของตัวประกอบเฉพาะทั้งหมด

### ตัวประกอบเฉพาะคืออะไร?
ตัวประกอบเฉพาะคือจำนวนเฉพาะที่นำมาคูณกันแล้วได้ตัวเลขนั้น

### ตัวอย่าง
- `primeFactors(12)` → `[2, 2, 3]` (เพราะ 2 × 2 × 3 = 12)
- `primeFactors(30)` → `[2, 3, 5]` (เพราะ 2 × 3 × 5 = 30)
- `primeFactors(8)` → `[2, 2, 2]` (เพราะ 2 × 2 × 2 = 8)
- `primeFactors(7)` → `[7]` (7 เป็นจำนวนเฉพาะ)
- `primeFactors(1)` → `[]` (ไม่มีตัวประกอบเฉพาะ)

**หมายเหตุ:** ไม่จำเป็นต้องเรียงลำดับจากน้อยไปมาก แต่ควรเรียงเพื่อให้ผ่าน test

## วิธีรัน test

### แบบง่าย (ไม่ต้องติดตั้งอะไร)
```bash
# Windows (PowerShell)
.\run-tests.bat

# หรือรันแบบ manual
javac PrimeFactors.java TestRunner.java
java TestRunner
```

### ใช้ Maven (ถ้ามี)
```bash
mvn test
```
