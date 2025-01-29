import numpy as np

# Parametre
u = np.array([0, 1])

A = np.array([[0, 1], [-1, 0]])

h = 0.1

def newtons(h, u, A):
    for i in range(1, 10):
        u_new = u + h*np.dot(np.linalg.inv(A), u)
        u = u_new
    return u_new

u_new = newtons(h, u, A)
print(u_new)