num = int(input("Enter a number: "))
temp = num
digits = len(str(num))
sum_val = 0

while temp > 0:
    sum_val += (temp % 10) ** digits
    temp //= 10

if sum_val == num:
    print("Armstrong Number")
else:
    print("Not an Armstrong Number")
