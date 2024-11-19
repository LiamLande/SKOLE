import numpy as np
# Parametre
m = 200000 # Enhet: kg
c = 40000  # Enhet: N*s/m
k = 300000 # Enhet: N/m
h = 0.05 # Steglengde
duration = 60 # Sekund

#-------------------------------------------------
# SKRIV DIN KODE HER: lagre egensvingningene som y
#-------------------------------------------------
t = np.arange(0, duration + h, h)
x_vals = np.zeros(t.shape[0])
y = np.zeros(t.shape[0])
# Initial conditions
x_vals[0] = 10
y[0] = 0

for i in range(1, len(t)):
    x1_new = x_vals[i-1] + h * (y[i-1])
    x2_new = y[i-1] + h * ((-k/m) * x_vals[i-1] + (-c/m) * y[i-1])
    
    x_vals[i] = x1_new
    y[i] = x2_new

print(np.array2string(y[20:220:20],formatter={'float_kind':'{0:.3f}'.format}))

arr = np.array([[3.905, -6.337, -7.477, 0.833, 7.126, 3.799, -3.869, -5.813, -0.285, 4.946]])

print(y[20:220:20]==arr)