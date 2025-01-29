import math
import numpy as np

def f(x):
    return math.exp(-x**2) 

n = 4

x_arr = (np.linspace(0, 1, n+1))


y_arr = np.zeros(n+1)

print(x_arr)
print(y_arr)

for i in range(n+1):
    if i == 0 or i == n:
        y_arr[i] = f(x_arr[i])
    elif i % 2 == 0:
        y_arr[i] = 2*f(x_arr[i])
    else:
        y_arr[i] = 4*f(x_arr[i])
    
print(y_arr)

integral = (0.25)/(3) * sum(y_arr)

print(integral)