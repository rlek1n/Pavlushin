new_num = int(input("Введите число: "))
if new_num > 7:
    print("Привет")

print()

new_name = input("Введите имя: ").capitalize()
if new_name == "Вячеслав":
    print("Привет,", new_name)
else:
    print("Имя не существует")

print()

print("Введите элементы массива. Его длина равна", new_num)
new_array = []
for i in range(new_num):
    array_num = int(input())
    if array_num % 3 == 0:
        new_array.append(array_num)
print("Элементы массива кратные числу 3:", *new_array)
