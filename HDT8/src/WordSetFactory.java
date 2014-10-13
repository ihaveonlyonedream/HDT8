/*
*		William Orozco, 13386
*		Dulce Chacon, 13463
*		Luis Gomez, 13135
*		Programa para contar diferentes tipos de palabras en un archivo de texto. 
*		HOJA DE TRABAJO 8
*
*		Se uso codigo de referencia adjuntado con la hoja de trabajo
*/

/*
 *  WordSetFactory.java: factory que instancia el tipo de estructura de dato a usar
 *  
 *      Se uso codigo de ejemplo proporcionado. 
 * 
 */

//package HT8;

class WordSetFactory {
	//Factory de WordSet. Manda a llamar a SelectSet, de acuerdo con el tipo de set que el usuario ingresa
	public static WordSet generateSet(int tipo)
	{
	    if (tipo == 1){
                return new SelectSet(1);}
            else if (tipo == 2){
                return new SelectSet(2);}
            else if (tipo == 3){
                return new SelectSet(3);}
            else if (tipo == 4){
                return new SelectSet(4);}
            else if (tipo == 5){
                return new SelectSet(5);}
            else{
            return null;}		
	}
}