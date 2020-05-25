# Eulers Method


Euler’s method is a numerical method that you can use to approximate the solution to an initial value problem with a 
differential equation that can’t be solved using a more traditional method, like the methods we use to solve separable, 
exact, or linear differential equations.

As part of a larger project that I am working on I needed to calculate differential equations using a numerical method that could be 
used in Java. The solution: Euler's Method.

# SIR Model

In an SIR model, the population is divided into three types:
-	Susceptible (S) (not infected),
-	Infectious (I), and
-	 Recovered (R) (that is, vaccinated or recovered with immunity).

We model each of S, I and R as functions of a time variable t , which is measured in days.
Our variables then become
S = S(t) = number of susceptible individuals at time t
I = I (t) = number of infected individuals at time t
R = R(t) = number of recovered individuals at time t

The transmission rate = B
The recovery rate y
Basic Reproduction Number R0 = B/y


