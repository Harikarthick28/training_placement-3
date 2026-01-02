nums = list(map(int, input("Enter numbers: ").split()))
unique = []

for n in nums:
    if n not in unique:
        unique.append(n)

print("After removing duplicates:", unique)
