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
 * RedBlackNode.java: nodo usado en la clase RedBlackTree
 * 
 * Tomado de: http://users.cis.fiu.edu/~weiss/dsaajava/code/DataStructures/RedBlackNode.java
 */
//package HT8;


    // Basic node stored in red-black trees
    // Note that this class is not accessible outside
    // of package DataStructures

public class RedBlackNode
    {
            // Constructors
        RedBlackNode( Comparable theElement )
        {
            this( theElement, null, null );
        }

        RedBlackNode( Comparable theElement, RedBlackNode lt, RedBlackNode rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
            color    = RedBlackTree.BLACK;
        }

            // Friendly data; accessible by other package routines
        Comparable   element;    // The data in the node
        RedBlackNode left;       // Left child
        RedBlackNode right;      // Right child
        int          color;      // Color
    }