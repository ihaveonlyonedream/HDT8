/*
*		William Orozco, 13386
*		Dulce Chacon, 13
*		Luis Gomez, 13
*		Programa para contar diferentes tipos de palabras en un archivo de texto. 
*		
*		HOJA DE TRABAJO 8
*
*		Se uso codigo de referencia adjuntado con la hoja de trabajo
*/

/*
 * Clase que sirve para instanciar. 
 */
//package HT8;

/*Se importan las clases necesarias de java*/
import java.util.TreeMap;
import java.util.Hashtable;

/*Esta clase implementa la interfaz wordSet, proporcionada con la hoja*/
public class SelectSet implements WordSet {
    /* Se usan las implementaciones de:
     * 1. RedBlackTree
     * 2. SplayTree
     * 3. HashTable
     * 4. TreeMap de JCF
     */
    int tipoSet =0;
    Integer llave = 0; /*llave para el hash table*/
    private SimpleSet estructura1;
    private RedBlackTree estructura2;
    private SplayTree estructura3;
    private Hashtable<Integer, Word> estructura4;
    private TreeMap estructura5;
    private Word palabra;
    
    /*Constructor, que instancia de acuerdo con el tipo de set*/
    public SelectSet(int tipo) {
        tipoSet = tipo;
        if (tipo == 1) {
            estructura1 = new SimpleSet();
        } else if (tipo == 2) {   
            estructura2 = new RedBlackTree(new Word());
        } else if (tipo == 3) {
            estructura3 = new SplayTree();
        } else if (tipo == 4) {
            estructura4 = new Hashtable<Integer, Word>();
        } else if (tipo == 5) {
            estructura5 = new TreeMap();
        }
        
    }
    
    /* Método para agregar  palabras*/
    public void add(Word wordObject) throws NullPointerException {
        if (tipoSet == 1) {
            estructura1.add(wordObject);
        } else if (tipoSet == 2) {
            estructura2.insert(wordObject);
        } else if (tipoSet == 3) {
            estructura3.insert(wordObject);
        } else if (tipoSet == 4) {
			if (estructura4.isEmpty())
				llave=0;
			else
				llave=estructura4.size();
            estructura4.put(llave, wordObject);
            //llave++;
        } else if (tipoSet == 5) {
            if (estructura5.isEmpty())
				llave=0;
			else
				llave=estructura5.size();
            estructura5.put(llave, wordObject);
			//llave++;
        }
    }
    
    /*Método para obtener palabras, retornando segun el tipo de estructura*/
    public Word get(Word word) {
		
        if (tipoSet == 1) {
            palabra = estructura1.get(word); 
        } else if (tipoSet == 2) { 
            palabra=(Word)estructura2.find(word);
        } else if (tipoSet == 3) {
            palabra=(Word)estructura3.find(word);
        } else if (tipoSet == 4) {
            
            if (estructura4.contains(word)){
				palabra=word;
                                palabra=(Word)palabra;
                                
            }
        } else if (tipoSet == 5) {
            if (estructura5.containsValue(word)){
				
				palabra=(Word)estructura5.get(llave);
				
            }
        }
        
        return palabra;
    }
}