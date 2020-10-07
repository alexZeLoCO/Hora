import java.util.Scanner;		//IMPORTAR SCANNER PARA Teclado
public class PruebaHora {

	public static void main(String[] args) {
		
		Scanner Teclado = new Scanner (System.in);		//CREAR OBJETO Teclado DE TIPO SCANNER
		Hora Tiempo = new Hora ();		//CREAR OBJETO Tiempo DE TIPO HORA
		
		System.out.print("Introduzca el segundo: ");		//SOLICITA SEGUNDO
		Tiempo.setSegundo(Teclado.nextShort());		//LLAMA MÉTODO SETSEGUNDO()
		System.out.print("Introduzca el minuto: ");			//SOLICITA MINUTO
		Tiempo.setMinuto(Teclado.nextShort());		//LLAMA MÉTODO SETMINUTO()
		System.out.print("Introduzca la hora: ");			//SOLICITA HORA
		Tiempo.setHora(Teclado.nextShort());		//LLAMA MÉTODO SETHORA()
		
				//SALIDA DE VALORES
		System.out.printf("La hora introducida es %d:%d:%d\n",Tiempo.getHora(),Tiempo.getMinuto(),Tiempo.getSegundo());
		System.out.printf("Han pasado %d segundos desde medianoche.",Tiempo.getSegundosDesdeMediaNoche());
				//SALIDA DE VALORES
	}
}
