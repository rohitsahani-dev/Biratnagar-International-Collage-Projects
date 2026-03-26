"""
Name: Rohit Sahani
Student ID: NP02CS4A250027
Coursework: Caesar Cipher with File Input/Output
"""

import os

def welcome():
    print("Welcome to the Caesar Cipher")
    print("This program encrypts and decrypts text using Caesar Cipher.")


def encrypt(message, shift):
    encrypted = ""
    message = message.upper()

    for char in message:
        if char.isalpha():
            new_char = ord(char) + shift
            if new_char > ord('Z'):
                new_char -= 26
            encrypted += chr(new_char)
        else:
            encrypted += char

    return encrypted


def decrypt(message, shift):
    decrypted = ""
    message = message.upper()

    for char in message:
        if char.isalpha():
            new_char = ord(char) - shift
            if new_char < ord('A'):
                new_char += 26
            decrypted += chr(new_char)
        else:
            decrypted += char

    return decrypted


def is_file(filename):
    """
    Checks whether a file exists in the current directory.
    """
    return os.path.isfile(filename)


def process_file(filename, mode, shift):
    """
    Reads messages from a file and encrypts/decrypts them.

    Returns:
        list: processed messages
    """
    results = []

    with open(filename, 'r') as file:
        for line in file:
            line = line.strip().upper()
            if mode == 'e':
                results.append(encrypt(line, shift))
            else:
                results.append(decrypt(line, shift))

    return results


def write_messages(messages):
    """
    Writes a list of messages to results.txt.
    """
    with open("results.txt", 'w') as file:
        for message in messages:
            file.write(message + "\n")


def message_or_file():
    """
    Determines mode and whether input comes from console or file.

    Returns:
        tuple: (mode, message or None, filename or None, shift)
    """
    # Mode validation
    while True:
        mode = input("Would you like to encrypt (e) or decrypt (d): ").lower()
        if mode in ['e', 'd']:
            break
        print("Invalid Mode")

    # Input type validation
    while True:
        choice = input("Would you like to read from a file (f) or the console (c)? ").lower()
        if choice in ['f', 'c']:
            break
        print("Invalid Choice")
        
    # Shift validation
    while True:
        shift_input = input("What is the shift number: ")
        if shift_input.isdigit():
            shift = int(shift_input)
            if 0 <= shift <= 25:
                break
        print("Invalid Shift")

    if choice == 'c':
        if mode == 'e':
            message = input("What message would you like to encrypt: ")
        else:
            message = input("What message would you like to decrypt: ")
        return mode, message.upper(), None, shift
    else:
        while True:
            filename = input("Enter a filename: ")
            if is_file(filename):
                return mode, None, filename, shift
            print("Invalid Filename")


def main():
    welcome()

    while True:
        mode, message, filename, shift = message_or_file()

        if message is not None:
            if mode == 'e':
                print(encrypt(message, shift))
            else:
                print(decrypt(message, shift))
        else:
            processed = process_file(filename, mode, shift)
            write_messages(processed)
            print("Output written to results.txt")

        while True:
            again = input("Would you like to encrypt or decrypt another message? (y/n): ").lower()
            if again in ['y', 'n']:
                break

        if again == 'n':
            print("Thanks for using the program, goodbye!")
            break

if __name__ == "__main__":
    main()
