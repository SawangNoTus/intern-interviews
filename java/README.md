# Prime Number Checker - Java

## โจทย์
เขียนเมธอด `public static boolean isPrime(int num)` ที่รับตัวเลข 1 ตัว และ return ค่า `true` หากเป็นจำนวนเฉพาะ หรือ `false` หากไม่ใช่

### จำนวนเฉพาะคืออะไร?
จำนวนเฉพาะคือจำนวนเต็มบวกที่มากกว่า 1 ซึ่งหารลงตัวได้เฉพาะ 1 กับตัวมันเองเท่านั้น

### ตัวอย่าง
- `isPrime(2)` → `true` (2 เป็นจำนวนเฉพาะ)
- `isPrime(7)` → `true` (7 เป็นจำนวนเฉพาะ)
- `isPrime(4)` → `false` (4 หารด้วย 2 ลงตัว)
- `isPrime(1)` → `false` (1 ไม่ถือว่าเป็นจำนวนเฉพาะ)

## วิธีรัน test

### ใช้ Maven
```bash
# Run tests
mvn test

# Clean and run tests
mvn clean test
```

### ใช้ Command Line (ไม่มี Maven)
```bash
# Compile
javac -cp ".;junit-platform-console-standalone-1.10.1.jar" IsPrime.java IsPrimeTest.java

# Run tests
java -jar junit-platform-console-standalone-1.10.1.jar --class-path . --scan-class-path
```

**หมายเหตุ:** ต้องมี Maven หรือ JUnit JAR file เพื่อรัน tests
