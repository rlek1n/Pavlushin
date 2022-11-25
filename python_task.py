new_num = int(input("Enter number: "))
if new_num > 7:
    print("Hello there")

print()

new_name = input("Enter the name (on Russian): ").capitalize()
if new_name == "Вячеслав":
    print(f"Привет, {new_name}")
else:
    print("Name not found")

print()

print("Fill the array. Its length is", new_num)
new_array = []
for i in range(new_num):
    array_num = int(input())
    if array_num % 3 == 0:
        new_array.append(array_num)
print("Array element(s) that multiple(s) of 3:", *new_array)
