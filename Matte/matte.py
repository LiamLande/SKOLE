import numpy as np
import math
import matplotlib.pyplot as plt

def implisittEuler(x_start,t_start,t_slutt,steg):
# beregner tilnærmet løsning i 't_slutt' med 'steg' antall steg og startverdi 'x_start' ved 't_start'
# for differensialligningen x' = -x+t
    x = x_start
    tk, h = np.linspace(t_start,t_slutt,steg+1,retstep=True) # beregner t_k og h
    
    for k in range(steg):
        x = x + h*(tk[k] - x)
    return x


def f(x, y):
    return np.sin(2* math.pi * x)* np.cos(3*math.pi*y+0.5*math.pi)+2


BOUND_X = [0, 1/2]
BOUND_Y = [-1/3, 1/3]

x_vals = np.linspace(0,1/2, 100)
y_vals = np.linspace(-1/3,1/3, 100)


X, Y = np.meshgrid(x_vals, y_vals)
Z = f(X, Y)

a = np.unravel_index(np.argmin(Z), Z.shape)

print(a)

print(X[a[0],a[1]], Y[a[0],a[1]])

b = np.unravel_index(np.argmax(Z), Z.shape)

print(b)
print(X[b], Y[b])


fig = plt.figure()
ax = plt.axes(projection='3d')

ax.plot_surface(X, Y, Z, cmap='cool', alpha=0.8)
 

ax.set_xlabel('x', fontsize=12)
ax.set_ylabel('y', fontsize=12)
ax.set_zlabel('z', fontsize=12)

plt.show()



