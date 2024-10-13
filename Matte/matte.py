import numpy as np

def implisittEuler(x_start,t_start,t_slutt,steg):
# beregner tilnærmet løsning i 't_slutt' med 'steg' antall steg og startverdi 'x_start' ved 't_start'
# for differensialligningen x' = -x+t
    x = x_start
    tk, h = np.linspace(t_start,t_slutt,steg+1,retstep=True) # beregner t_k og h
    
    for k in range(steg):
        x = x + h*(tk[k] - x)
    return x