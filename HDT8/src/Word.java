//package HT8;
/*
*		William Orozco, 13386
*		Dulce Chacon, 13
*		Luis Gomez, 13
*		Programa para contar diferentes tipos de palabras en un archivo de texto. 
*		HOJA DE TRABAJO 8
*
*		Se uso codigo de referencia adjuntado con la hoja de trabajo
*
*		Descripci�n: Word. Clase para almacenar las palabras junto con su tipo. 
*/
class Word implements Comparable<Word> {
	private String word;
	private String type;
	
	// Constructor, inicializa la palabra con su tipo
	public Word(String word, String type)
	{
		this.word=word;
		this.type=type;
	}
	
	public Word()
	{
		this.word= "";
		this.type="";
	}
	
	// Comparadores, solo importa comparar la palabra, no el tipo.
	public int compareTo(Word o)
	{
		return this.word.compareTo(o.getWord());
	}
	
	public boolean equals(Object obj)
	{
		return (obj instanceof Word && getWord().equals(((Word)obj).getWord()));
	}
	
	// M�todos de acceso..
	public void setWord(String word)
	{
		this.word=word;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getWord()
	{
		return word;
	}
	
	public String getType()
	{
		return type;
	}
	
}