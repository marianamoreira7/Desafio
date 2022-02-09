num1 = int(input('Digite o primeiro numero: '))
num2 = int(input('Digite o segundo numero '))
num3 = int(input('Digite o terceiro numero '))
maxNumber = num1
if(num2 > maxNumber):
    maxNumber = num2
if(num3 > maxNumber):
    maxNumber = num3

print('o maior numero eh ',maxNumber)
