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
 * BinaryNode.java: nodo empleado en un arbol desbalanceado.
 *                  Se usa en la clase SplayTree
 * Tomado de: http://users.cis.fiu.edu/~weiss/dsaajava/code/DataStructures/BinaryNode.java
 */
//package HT8;


    class BinaryNode
    {
            // Constructors
        BinaryNode( Comparable theElement )
        {
            this( theElement, null, null );
        }

        BinaryNode( Comparable theElement, BinaryNode lt, BinaryNode rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
        }

            // Friendly data; accessible by other package routines
        Comparable element;      // The data in the node
        BinaryNode left;         // Left child
        BinaryNode right;        // Right child
    }
