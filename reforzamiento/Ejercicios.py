h: int()

h= int(input("Ingrese la hora:"))

if(h>=6 and h<=12):
    print("BUENOS DIAS")
else:
    if(h>=13 and h<=20):
        print("BUENAS TARDES")
    elif(h>=21 and h<=23) or (h>=0 and h<=5):
        print("BUENAS NOCHES")
    else:
        print("Esa hora no existe")

