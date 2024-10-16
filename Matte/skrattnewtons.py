import numpy as np
import matplotlib.pyplot as plt


# Parametre
y_bakke = -7  # Høydeforskjell mellom kanonstilling og blink
g = 9.81      # Tyngdekraftskonstant
x_lengde = 28 # Horisontal distanse til blink 
v0 = 15       # Starthastighet

# Funksjonen f(theta) fra oppgave a)
def f(theta, x_b = x_lengde, y_b =y_bakke, v_0 = v0, g=g):
    # Convert theta from degrees to radians
    theta_rad = np.deg2rad(theta)
    
    return x_b*np.tan(theta_rad) - (1/2)*g*((x_b)/(v_0*np.cos(theta_rad)))*((x_b)/(v_0*np.cos(theta_rad))) - y_b

    
# Den deriverte til funksjonen f(theta)
def df(theta,x_b = x_lengde, v_0 = v0, g=g):
    #-------------------------------------
    # SKRIV DIN KODE HER:
    #-------------------------------------
    theta_rad = np.deg2rad(theta)

    return x_b/(np.cos(theta_rad)**2) - ((g*np.sin(theta_rad))/(np.cos(theta_rad)*np.cos(theta_rad)*np.cos(theta_rad)))*(x_b/v_0)*(x_b/v_0)

# Bruk funksjoene f(theta) og df(theta) til å utføre newtons metode for to startpunkt
#-------------------------------------
# SKRIV DIN KODE HER:
#-------------------------------------
def newtons_metode(f, df, x0, tol = 1e-9, max_iter = 10000):
    x = x0
    for i in range(max_iter):
        x_new = x - f(x)/df(x)
        if abs(x_new - x) < tol:
            return x_new
        x = x_new
    return x

theta1 = newtons_metode(f, df, 20)
theta2 = newtons_metode(f, df, 50)

print(f'To løsninger for vinkelen theta er {theta1:.2f} og {theta2:.2f}')