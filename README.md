# Physics20_Problem_Solver
This is the final project I created in my High School Computer Science 20 course. 
It is a Basic Physics 20 Problem solver. It has most of the basic equations used in Physics 20 and is 
able to calculate for a specific variable, when given known values for all the other variables in the equation.
It brings together alot of the components of Java that I learned in that class.


CREATED: January, 2021

COMPONENTS THAT NEED WORK:
Looking back at this project with the knowledge I now have, I'd see this program needs work in a couple areas:
1. Handling of errors caused by the user; A user could mistype a number as a letter an the program would crash with a mismatch type error
2. How the program determines the unknown variable in the equation from the user; The program uses a special number '9.9999' as the code 
for an unknown variable which is not very ideal since that could be an actual value for a different variable
3. Value that function returns to indicate that the value could not be calculated; Program returns '0.0' as the 'error value' to 
indiciate an error occured. This is again not ideal since this could be the actual answer of a problem.