Algoritmo capacidad_de_inventario
	Definir stock_actual, stock_minimo, max_capacidad_estante Como Real
	Definir requiere_auditoria Como Logico	
	Escribir 'Ingresar el stock actual'
	Leer stock_actual
	Escribir 'Ingresar el stock minimo de seguridad permitido'
	Leer stock_minimo
	Escribir 'Cual es la capacidad maxima del estante'
	Leer max_capacidad_estante	
	requiere_auditoria <- stock_actual <= stock_minimo o stock_actual > max_capacidad_estante	
	Escribir requiere_auditoria	
FinAlgoritmo
