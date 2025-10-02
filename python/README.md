# Prime Number Checker - Python

## โจทย์
เขียนฟังก์ชัน `is_prime(num: int) -> bool` ที่รับตัวเลข 1 ตัว และ return ค่า `True` หากเป็นจำนวนเฉพาะ หรือ `False` หากไม่ใช่

### จำนวนเฉพาะคืออะไร?
จำนวนเฉพาะคือจำนวนเต็มบวกที่มากกว่า 1 ซึ่งหารลงตัวได้เฉพาะ 1 กับตัวมันเองเท่านั้น

### ตัวอย่าง
- `is_prime(2)` → `True` (2 เป็นจำนวนเฉพาะ)
- `is_prime(7)` → `True` (7 เป็นจำนวนเฉพาะ)
- `is_prime(4)` → `False` (4 หารด้วย 2 ลงตัว)
- `is_prime(1)` → `False` (1 ไม่ถือว่าเป็นจำนวนเฉพาะ)

## วิธีรัน test

```bash
# Run tests
python test_is_prime.py

# หรือใช้ pytest (ต้อง install ก่อน: pip install pytest)
pytest test_is_prime.py -v
```
