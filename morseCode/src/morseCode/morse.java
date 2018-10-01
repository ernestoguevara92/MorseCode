//Roberto Ernesto Guevara
//Programa que convierte texto a código morse

package morseCode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class morse {
	//crear diccionario 
	public static void main(String[] args) {
		Map<Character, String>toMorse = new HashMap<Character, String>();
		toMorse.put(' ', "   ");
		toMorse.put('A', ".- ");
		toMorse.put('B', "-... ");
		toMorse.put('C', "-.-. ");
		toMorse.put('D', "-.. ");
		toMorse.put('E', ". ");
		toMorse.put('F', "..-. ");
		toMorse.put('G', "--. ");
		toMorse.put('H', ".... ");
		toMorse.put('I', ".. ");
		toMorse.put('J', ".--- ");
		toMorse.put('K', "-.- ");
		toMorse.put('L', ".-.. ");
		toMorse.put('M', "-- ");
		toMorse.put('N', "-. ");
		toMorse.put('O', "--- ");
		toMorse.put('P', ".--. ");
		toMorse.put('Q', "--.- ");
		toMorse.put('R', ".-. ");
		toMorse.put('S', "... ");
		toMorse.put('T', "- ");
		toMorse.put('U', "..- ");
		toMorse.put('V', "...- ");
		toMorse.put('W', ".-- ");
		toMorse.put('X', "-..- ");
		toMorse.put('Y', "-.-- ");
		toMorse.put('Z', "--.. ");
		toMorse.put('0', "----- ");
		toMorse.put('1', ".---- ");
		toMorse.put('2', "..--- ");
		toMorse.put('3', "...-- ");
		toMorse.put('4', "....- ");
		toMorse.put('5', "..... ");
		toMorse.put('6', "-.... ");
		toMorse.put('7', "--... ");
		toMorse.put('8', "---.. ");
		toMorse.put('9', "----. ");
	String texto;
	//pedir al usuario que ingrese un texto
	Scanner string = new Scanner(System.in);
	System.out.println("Escribe un texto: ");
	texto = string.nextLine();
	//convertir texto a mayusculas
	String upperCase = texto.toUpperCase();
	//guardar el texto en un arreglo de caracteres
	char charArray[] = upperCase.toCharArray();
	//imprime el texto en código morse
	for(char c : charArray) {
		System.out.print(toMorse.get(c));
	}
	}
}
