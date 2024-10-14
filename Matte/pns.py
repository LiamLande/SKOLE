import numpy as np

# Constants
m = 70
b = 0.42
g = 9.81
h = 1
t_end = 30
tk = np.arange(0, t_end + h, h)
vk = np.zeros(tk.shape[0])  # ensure floating point type

# Velocity derivative function
def velocity_derivative(v):
    return (b * v**2) / m - g

# Euler method implementation to calculate velocities
def euler_method(h, t_end):
    for k in range(1, len(tk)):
        vk[k] = vk[k-1] + h * velocity_derivative(vk[k-1])
    return tk, vk

# Run Euler's method to get velocity values
t_values, vk = euler_method(h, t_end)

# Trapezoidal method to find z(t)
zk = np.zeros(tk.shape[0])  # Initialize position array
zk[0] = 3000  # Initial height is 3000 meters

for k in range(1, len(tk)):
    zk[k] = zk[k-1] + (h / 2) * (vk[k-1] + vk[k])  # Trapezoidal rule
