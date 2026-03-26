##print("Author: Rohit Sahani")
##
##
##def reverse_iter(s):
##    return s[::-1]
##
##def reverse_rec(s):
##    if not s:
##        return s
##    return reverse_rec(s[1:]) + s[0]
##
##
##iter_text = input("Enter string to reverse iteratively: ")
##print("Iterative result:", reverse_iter(iter_text))
##
##rec_text = input("Enter string to reverse recursively: ")
##print("Recursive result:", reverse_rec(rec_text))
##

##print("Author: Rohit Sahani")
##
##def is_prime_iter(n):
##    if n < 2:
##        return False
##    for i in range(2, int(n**0.5) + 1):
##        if n % i == 0:
##            return False
##    return True
##
##def is_prime_rec(n, d=2):
##    if n < 2:
##        return False
##    if d * d > n:
##        return True
##    if n % d == 0:
##        return False
##    return is_prime_rec(n, d + 1)
##
##num1 = int(input("Enter number to check iteratively: "))
##print(is_prime_iter(num1))
##
##num2 = int(input("Enter number to check recursively: "))
##print(is_prime_rec(num2))

##print("Author: Rohit Sahani")
##
##def letter_frequency_iter(s, letter):
##    count = 0
##    for char in s:
##        if char == letter:
##            count += 1
##    return count
##
##def letter_frequency_rec(s, letter):
##    if not s:
##        return 0
##    return (s[0] == letter) + letter_frequency_rec(s[1:], letter)
##
##s1 = input("Enter string (iterative): ")
##l1 = input("Enter letter (iterative): ")
##print(letter_frequency_iter(s1, l1))
##
##s2 = input("Enter string (recursive): ")
##l2 = input("Enter letter (recursive): ")
##print(letter_frequency_rec(s2, l2))




##print("Author: Rohit Sahani")
##
##def binary_iter(n):
##    if n == 0: return "0"
##    res = ""
##    while n > 0:
##        res = str(n % 2) + res
##        n //= 2
##    return res
##
##def binary_rec(n):
##    if n == 0: return "0"
##    if n == 1: return "1"
##    return binary_rec(n // 2) + str(n % 2)
##
##num1 = int(input("Enter decimal for iterative: "))
##print(binary_iter(num1))
##
##num2 = int(input("Enter decimal for recursive: "))
##print(binary_rec(num2))


##print("Author: Rohit Sahani")
##
##def fib_iter(n):
##    a, b = 0, 1
##    for _ in range(n):
##        a, b = b, a + b
##    return a
##
##def fib_rec(n):
##    if n <= 1: return n
##    return fib_rec(n-1) + fib_rec(n-2)
##
##n1 = int(input("Enter index for iterative: "))
##print(fib_iter(n1))
##
##n2 = int(input("Enter index for recursive: "))
##print(fib_rec(n2))

##print("Author: Rohit Sahani")
##
##def sumlist_iter(nums):
##    total = 0
##    for n in nums:
##        total += n
##    return total
##
##def sumlist_rec(nums):
##    if not nums:
##        return 0
##    return nums[0] + sumlist_rec(nums[1:])
##
##list1 = [int(x) for x in input("Enter numbers for iterative (space-separated): ").split()]
##print(sumlist_iter(list1))
##
##list2 = [int(x) for x in input("Enter numbers for recursive (space-separated): ").split()]
##print(sumlist_rec(list2))


##print("Author: Rohit Sahani")
##
##def sumlist_iter(nums):
##    return sum(nums)
##
##def sumlist_rec(nums):
##    if not nums:
##        return 0
##    return nums[0] + sumlist_rec(nums[1:])
##
##
##list1 = eval(input("Enter list (e.g. [1,2,3]): "))
##print(sumlist_iter(list1))
##
##list2 = eval(input("Enter list (e.g. [4,5,6]): "))
##print(sumlist_rec(list2))


##print("Author: Rohit Sahani")
##
##def harmonic(n):
##    if n < 2: return 1
##    return 1/n + harmonic(n-1)
##
##n = int(input("Enter number to calculate the harmonic mean: "))
##print(harmonic(n))

##print("Author: Rohit Sahani")
##import math
##def power(a, b):
##    if b == 0:
##        return 1
##    return a * power(a, b - 1)
##
##base = int(input("Enter base (a): "))
##exp = int(input("Enter exponent (b): "))
##print(power(base, exp))

##print("Author: Rohit Sahani")
##
##def greatest_common_denominator(a, b):
##    if b == 0:
##        return a
##    return greatest_common_denominator(b, a % b)
##
##num1 = int(input("Enter first number: "))
##num2 = int(input("Enter second number: "))
##print(greatest_common_denominator(num1, num2))

##print("Author: Rohit Sahani")
##
##def stars_iter():
##    for i in range(12, 1, -2):
##        spaces = (12 - i) // 2
##        print(" " * spaces + "*" * i)
##
##def stars_rec(n, total=12):
##    if n >= 2:
##        spaces = (total - n) // 2
##        print(" " * spaces + "*" * n)
##        stars_rec(n - 2, total)
##
##print("Iterative:")
##stars_iter()
##
##print("\nRecursive:")
##stars_rec(12)



##print("Author: Rohit Sahani")
##
##def stars_iter():
##    for i in range(2, 15, 2):
##        if i == 8: continue
##        print(" " * ((14 - i) // 2) + "*" * i)
##
##
##def stars_rec(n, total=14):
##    if n <= 14:
##        if n != 8:
##            print(" " * ((total - n) // 2) + "*" * n)
##        stars_rec(n + 2, total)
##
##print("Iterative:")
##stars_iter()
##
##print("\nRecursive:")
##stars_rec(2)





##print("Author: Rohit Sahani")
##print("Think of a number between 1 and 100!")
##
##low = 1
##high = 100
##correct = False
##
##while not correct:
##    guess = (low + high) // 2
##    print(f"My guess is: {guess}")
##    
##    user_input = input("Is it Correct (c), Higher (h), or Lower (l)? ").lower()
##    
##    if user_input == 'c':
##        print(f"Hooray! I guessed it. Your number was {guess}.")
##        correct = True
##    elif user_input == 'h':
##        low = guess + 1
##    elif user_input == 'l':
##        high = guess - 1
##    else:
##        print("Invalid input. Please enter 'c', 'h', or 'l'.")




print("Author: Rohit Sahani")
print("Think of a number between 1 and 100!")

def guess_recursive(low, high):
    if low > high:
        print("Wait, are you sure? The numbers don't add up!")
        return

    guess = (low + high) // 2
    print(f"My guess is: {guess}")
    
    user_input = input("Is it Correct (c), Higher (h), or Lower (l)? ").lower()

    if user_input == 'c':
        print(f"Hooray! The number was {guess}.")
    elif user_input == 'h':
        guess_recursive(guess + 1, high)
    elif user_input == 'l':
        guess_recursive(low, guess - 1)
    else:
        print("Invalid input. Use 'c', 'h', or 'l'.")
        guess_recursive(low, high)

guess_recursive(1, 100)
















