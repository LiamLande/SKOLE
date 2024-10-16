import numpy as np

# Parametre
m = 200000  # Enhet: kg
c = 40000   # Enhet: N*s/m
k = 300000  # Enhet: N/m
h = 0.05    # Steglengde
duration = 60  # Sekund

# Tidsarray
t = np.arange(0, duration + h, h)

# Arrays for displacement (x) and velocity (y)
x_vals = np.zeros(t.shape[0])  # Displacement
y = np.zeros(t.shape[0])       # Velocity

# Initial conditions
x_vals[0] = 10  # Initial displacement
y[0] = 0        # Initial velocity

# Numerical integration using Euler's method
for i in range(1, len(t)):
    x1_new = x_vals[i-1] + h * y[i-1]  # Update displacement
    x2_new = y[i-1] + h * ((-k/m) * x_vals[i-1] + (-c/m) * y[i-1])  # Update velocity

    x_vals[i] = x1_new
    y[i] = x2_new

# Now x_vals contains the displacement and y contains the velocity.
def is_slice_in_list(s,l):
    len_s = len(s) #so we don't recompute length of s on every iteration
    return any(s == l[i:len_s+i] for i in range(len(l) - len_s+1))
    
fasit = np.array([[3.905, -6.337, -7.477, 0.833, 7.126, 3.799, -3.869 ,-5.813, -0.285, 4.946]])

print(is_slice_in_list(y,fasit))

a = np.where(y == 0.833)
print(a)