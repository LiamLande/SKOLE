import numpy as np

def euler_method(f, t0, x0, h, n):
    """
    Implements Euler's method for solving ODEs.
    
    Parameters:
    f  : function - The differential equation in the form f(t, x)
    t0 : float    - Initial value of t
    x0 : float    - Initial value of x
    h  : float    - Step size
    n  : int      - Number of steps
    
    Returns:
    list of tuples - Each tuple contains (t, x) at each step
    """
    t = t0
    x = x0
    results = [(t, x)]
    
    for _ in range(n):
        x = x + h * f(t, x)
        t = t + h
        results.append((t, x))
    
    return results

# Define the differential equation dx/dt = f(t, x)
def f(t, x):
    return t - x

# Initial conditions
t0 = 0
x0 = 0

# Number of steps
N = 50
# Step size
h = 2 / N

# Solve the ODE using Euler's method
results = euler_method(f, t0, x0, h, N)

# Exact solution at t = 2
exact_solution = 1 + np.exp(-2)

# Find the numerical solution at t = 2
x = results[-1][1]

# Calculate the error
error = abs(exact_solution - x)

# Print the results
print(f"Numerical solution at t = 2: {x:.6f}")
print(f"Exact solution at t = 2: {exact_solution:.6f}")
print(f"Error: {error:.6f}")
