


import random
import sys
import os

print("Hello World")

name = "Jiho"
print(name)

quote = "\"Always remember you are unique"
print("%s %s %s" %('I like the quote', quote, name))

grocery_list = ["Juice", "Tomatoes"]
print(grocery_list[0:3])

grocery_list.sort()
grocery_list.reverse()
print(grocery_list[0:3])

pi_tuple = (3,1,4,1,5,9)
new_tuple = list(pi_tuple)
new_list = tuple(new_tuple)



age = 21
if age > 16 :
    print('You are older than 21')
else :
    print('You are younger than 21')



for x in range(0, 10):
    print(x, ' ')
print('\n')



grocery_list = ["Juice", "Tomatoes", "Potatoes", "Bananas"]
for y in grocery_list:
    print(y)



random_num = random.randrange(0,10)

while(random_num != 5):
    print(random_num)
    random_num = random.randrange(0,10)



def addNumber(fNum, lNum):
    sumNum = fNum + lNum
    return sumNum

print(addNumber(4,4))



class Animal:
    __name = "private"
    __height = None
    __wieght = 0
    __sound = 0
    
    def __init__(self, name, height, weight, sound):
        self.__name = name
        self.__height = height
        self.__weight = weight
        self.__sound = sound

    def set_name(self, name):
        self.__name = name
    
    def get_name(self):
        return self.__name

    #polymorphism









