class Media:
    @staticmethod
    def calcula(numeros:str) -> float:
        lista_numeros = numeros.split("#")
        media = float()
        for x in lista_numeros:
            media += float(x)/len(lista_numeros)
        
        return media
