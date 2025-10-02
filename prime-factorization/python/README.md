# Prime Factorization - Python

## โจทย์
เขียนฟังก์ชัน `prime_factors(num: int) -> list[int]` ที่รับตัวเลข 1 ตัว และ return list ของตัวประกอบเฉพาะทั้งหมด

### ตัวประกอบเฉพาะคืออะไร?
ตัวประกอบเฉพาะคือจำนวนเฉพาะที่นำมาคูณกันแล้วได้ตัวเลขนั้น

### ตัวอย่าง
- `prime_factors(12)` → `[2, 2, 3]` (เพราะ 2 × 2 × 3 = 12)
- `prime_factors(30)` → `[2, 3, 5]` (เพราะ 2 × 3 × 5 = 30)
- `prime_factors(8)` → `[2, 2, 2]` (เพราะ 2 × 2 × 2 = 8)
- `prime_factors(7)` → `[7]` (7 เป็นจำนวนเฉพาะ)
- `prime_factors(1)` → `[]` (ไม่มีตัวประกอบเฉพาะ)

**หมายเหตุ:** ไม่จำเป็นต้องเรียงลำดับจากน้อยไปมาก แต่ควรเรียงเพื่อให้ผ่าน test

## วิธีรัน test

```bash
# Run tests
python test_prime_factors.py

# หรือใช้ pytest (ต้อง install ก่อน: pip install pytest)
pytest test_prime_factors.py -v
```
