import numpy as np
import matplotlib.pyplot as plt

# Parametre
y_bakke = -7  # Høydeforskjell mellom kanonstilling og blink
g = 9.81      # Tyngdekraftskonstant
x_lengde = 28 # Horisontal distanse til blink 
v0 = 15       # Starthastighet


def f(theta, x_b = x_lengde, y_b =y_bakke, v_0 = v0, g=g):
    # Convert theta from degrees to radians
    theta_rad = np.deg2rad(theta)
    
    return x_b*np.tan(theta_rad) - (1/2)*g*((x_b)/(v_0*np.cos(theta_rad)))*((x_b)/(v_0*np.cos(theta_rad))) - y_b

#-------------------------------------
# SKRIV DIN KODE HER:
#-------------------------------------
theta = np.linspace(15,60,100)
f_vals = f(theta)
plt.plot((theta),f_vals)
plt.xlabel('Vinkel (grader)')
plt.ylabel('Funksjonsverdi')
plt.title('Funksjonsverdi mot vinkel')
plt.grid()
plt.show()
