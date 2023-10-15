from Media import Media


def main():
    ex1 = "15#3#8"
    ex2 = "3#1#1#1#4"

    print("EX1 Media:", Media.calcula(ex1).__format__(".4f"))
    print("EX2 Media:", Media.calcula(ex2))


if __name__ == "__main__":
    main()
