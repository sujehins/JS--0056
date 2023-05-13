Dimension  matrix[3,3]
   Definir grp Como Caracter
   Definir fila , colum Como Entero
   Definir existe Como Logico
   
   existe <- Falso
 
   Para f<-0 Hasta 2 Con Paso 1 Hacer   //ingreso Valores
    Para c<-0 Hasta 2 Con Paso 1 Hacer
     Escribir "Ingrese Una fruta"
     Leer matrix[f,c]
    FinPara
   FinPara
   
   Escribir " buscar  fruta "
   Leer grp
   
   
   Para f<-0 Hasta 2 Con Paso 1 Hacer
    Para c<-0 Hasta 2 Con Paso 1 Hacer
     
     si (matrix[f,c] == grp) Entonces
      
      fila<-f
      colum<-c
      existe = Verdadero
     FinSi
     
    FinPara
   FinPara
   
   
   si (existe == Verdadero) Entonces
    Escribir "Encotrar una Fruta"
    Escribir " Fila : " , fila
    Escribir "Columna : " , colum
    
    
   SiNo
    
     Escribir "No esta la fruta"
   FinSi
