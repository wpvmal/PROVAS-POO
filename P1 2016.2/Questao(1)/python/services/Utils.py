class Utils:
    @staticmethod
    def boolean_to_int(array_boolean: list) -> list[int]:
        array_int = list()

        for x in array_boolean:
            array_int.append(int(x))

        return array_int
