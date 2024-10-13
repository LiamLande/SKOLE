import numpy as np

x0 = 0
y0 = 1

h = 0.1

# Eulers metode

x = x0
y = y0
for n in range(10):
    x, y = x + h*y,  y - h* x
    

print(x, y)

A = np.array([[0,1],[-1,0]])

z = np.array([x0,y0])

for n in range(10):
    z = z + h*A@z

print( z)