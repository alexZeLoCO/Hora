public class Hora {
	
//-------------INICIALIZACIÓN DE VARIABLES--------------
	private short Hora;		//VARIABLE HORA
	private short Minuto;		//VARIABLE MINUTO
	private short Segundo;		//VARIABLE SEGUNDO
	
//------------------MÉTODOS GET--------------------
	public short getHora (){		//MÉTODO GETHORA()
		return Hora;		//DEVUELVE LA HORA
	}
	public short getMinuto () {		//MÉTODO GETMINUTO()
		return Minuto;		//DEVUELVE EL MINUTO
	}
	public short getSegundo () {		//MÉTODO GETSEGUNDO()
		return Segundo;		//DEVUELVE EL SEGUNDO
	}
	public int getSegundosDesdeMediaNoche() {		//MÉTODO GETSEGUNDOSDESDEMEDIANOCHE()
		return getHora()*3600+getMinuto()*60+getSegundo();		//DEVUELVE LOS SEGUNDOS DESDE MEDIA NOCHE
	}
	
//---------------MÉTODOS SET-------------
	public void setHora (short H) {			//MÉTODO SETHORA (SHORT H)
		//COMPRUEBA QUE LA HORA (H) ES CORRECTA
		
		if (H<0 || H>24) {		//CONDICIÓN: SI H ES NEGATIVO O SUPERIOR A 24
			System.out.print("La hora introducida no es válida");
			System.exit(0);		//CIERRA PROGRAMA
			
		} else {		//HORA VÁLIDA
			Hora = H;		//ALMACENA VALOR DE H EN HORA
		}
	}
	
	
	public void setMinuto (short M) {		//MÉTODO SETMINUTO (SHORT M)
		//COMPRUEBA QUE EL MINUTO (M) ES CORRECTO
		
		if (M<0 || M>60) {		//CONDICIÓN: SI MINUTO ES NEGATIVO O MAYOR A 60
			System.out.print("El minuto introducido no es válido");
			System.exit(0);		//CIERRA PROGRAMA
			
		} else {		//MINUTO VÁLIDO
			Minuto = M;		//ALMACENA VALOR DE M EN MINUTO
		}
	}
	
	
	public void setSegundo (short S) {		//MÉTODO SETSEGUNDO (SHORT S)
		//COMPRUEBA QUE EL SEGUNDO (S) ES VÁLIDO
		
		if (S<0 || S>60) {		//CONDICIÓN: SI S ES NEGATIVO O MAYOR A 60
			System.out.print("El segundo introducido no es válido");
			System.exit(0);		//CIERRA PROGRAMA
			
		} else {		//SEGUNDO VÁLIDO
			Segundo = S;		//ALMACENAR VALOR DE S EN SEGUNDO
		}
	}
}
