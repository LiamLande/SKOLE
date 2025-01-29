import math
import numpy as np

def f(x):
    return math.log(x)

n = 10

x_arr = np.linspace(1, 2, n)

y_arr = np.zeros(n)

for i in range(n):
    if i == 0 and i == n-1:
        y_arr[i] = f(x_arr[i])
    else:
        y_arr[i] = 2*f(x_arr[i])

integral = (2-1)/n * sum(y_arr)

print(integral)