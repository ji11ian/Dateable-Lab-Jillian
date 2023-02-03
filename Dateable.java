class Dateable:
    def __init__(self, age):
        self.age = age

    def youngest_dateable(self):
        return (self.age // 2) + 7

def main():
    age = int(input("Enter your age: "))
    d = Dateable(age)
    print("{}-year olds should date somebody who is at least {} years old.".format(age, d.youngest_dateable()))

if __name__ == "__main__":
    main()
