import services.Utils as utilBool


def main():
    array_boolean = [False, True, True, False, False, False, True, True, False]

    array_int = utilBool.Utils.boolean_to_int(array_boolean)
    for x in array_int:
        print(x)


if __name__ == "__main__":
    main()
