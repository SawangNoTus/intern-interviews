# Prime Number Checker - JavaScript

## โจทย์
เขียนฟังก์ชัน `isPrime(num)` ที่รับตัวเลข 1 ตัว และ return ค่า `true` หากเป็นจำนวนเฉพาะ หรือ `false` หากไม่ใช่

### จำนวนเฉพาะคืออะไร?
จำนวนเฉพาะคือจำนวนเต็มบวกที่มากกว่า 1 ซึ่งหารลงตัวได้เฉพาะ 1 กับตัวมันเองเท่านั้น

### ตัวอย่าง
- `isPrime(2)` → `true` (2 เป็นจำนวนเฉพาะ)
- `isPrime(7)` → `true` (7 เป็นจำนวนเฉพาะ)
- `isPrime(4)` → `false` (4 หารด้วย 2 ลงตัว)
- `isPrime(1)` → `false` (1 ไม่ถือว่าเป็นจำนวนเฉพาะ)

## วิธีรัน test

```bash
# Install dependencies
npm install

# Run tests
npm test
```
