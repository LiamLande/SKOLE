import numpy as np
import matplotlib.pyplot as plt

# Konstanter
m = 1e5  # Masse (kg)
c = 1e5  # Dempingsfaktoren til bygningen (N·s/m)
k = 1e6  # Horisontale Stivheten (N/m)
h = 0.1  # Time step (s)

# Time points and p(t)
t_values = np.arange(0, 0.9, h)  # t = 0, 0.1, ..., 0.8
p_values = np.array([0.30, 0.39, 0.42, 0.43, 0.33, 0.20, 0.15, 0.11]) * 1e-5

# Initialverdier
x = [1]  
v = [0]  

# Eulers metode
for i in range(len(t_values) - 1):
    t = t_values[i]
    p = p_values[i]
    
    # diffligningene
    dxdt = v[-1]
    dvdt = (p - c * v[-1] - k * x[-1]) / m
    
    # Nye verdier
    x_new = x[-1] + h * dxdt
    v_new = v[-1] + h * dvdt
    
    # legge til de nye verdiene ikkesant
    x.append(x_new)
    v.append(v_new)

# Plotte svara
plt.plot(t_values, x, label="x(t) - Bevegelse")
plt.xlabel("Tid (s)")
plt.ylabel("Bevegelse (m)")
plt.title("Bevegelse av bygning")
plt.legend()
plt.grid()
plt.show()
