//package HT8;
/*
*		William Orozco, 13386
*		Dulce Chacon, 13463
*		Luis Gomez, 13135
*		Programa para contar diferentes tipos de palabras en un archivo de texto. 
*		HOJA DE TRABAJO 8
*
*		Se uso codigo de referencia adjuntado con la hoja de trabajo
*
*		Descripci�n: SimpleSet ejemplo con ArrayList.
*/
import java.util.ArrayList;

class SimpleSet implements WordSet
{
	private ArrayList<Word> base;
	
	public SimpleSet()
	{
		base = new ArrayList<Word>();
	}
	
	public Word get(Word word)
	{
		int index = base.indexOf(word);
		if(index == -1) return null;
		return base.get(index);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}