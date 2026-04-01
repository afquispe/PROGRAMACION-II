import math
class Vector:
    def __init__(self,x,y,z):
        self.x=x
        self.y=y
        self.z=z
    def __add__(self,other):
        return Vector(
            self.x+other.x,
            self.y+other.y,
            self.z+other.z
            )
    def __mul__(self,r):
        return Vector(
            self.x*r,
            self.y*r,
            self.z*r
            )
    def magnitud(self):
        return math.sqrt(self.x**2+self.y**2+self.z**2)

    def normal (self):
        mag= self.magnitud()
        return Vector(
            self.x/mag,
            self.y/mag,
            self.z/mag
            )
    def producto_escalar(self,other):
        return self.x*other.x+self.y*other.y+self.z*other.z
    def producto_vectorial(self,other):
        return Vector(
            self.y * other.z - self.z * other.y,
            self.z * other.x - self.x * other.z,
            self.x * other.y - self.y * other.x
            )
    def __str__(self):
        return f"({self.x:.2f},{self.y:.2f},{self.z:.2f})"

a= Vector(7,5,3)
b= Vector(9,5,1)

print ("Suma:", a + b)
print ("Escalar:", a*3)
print ("Magnitud a:", a.magnitud())
print ("Normal a :", a.normal())
print ("Magnitud b:", b.magnitud())
print ("Normal b:", b.normal())
print ("Producto escalar:", a.producto_escalar(b))
print ("Producto vectorial:", a.producto_vectorial(b))