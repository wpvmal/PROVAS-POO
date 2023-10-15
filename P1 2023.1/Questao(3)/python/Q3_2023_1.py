class String:
    @staticmethod
    def inverter(string: str) -> str:
        lista_chars = list()
        for c in string:
            lista_chars.insert(0, c)

        string_invertida = str()
        for c in lista_chars:
            string_invertida += c

        return string_invertida


print(String.inverter("William"))
