// El nombre de la clase y del fichero tienen que ser el mismo
// Para poder acceder desde fuera a la clase tiene que ser public
// Puede haber una clase privada siempre que no sea la principal del fichero
// Las clases pueden ser public, private o protected que no se escribe nada igual que en python
// Public, cualquiera puede acceder, Private no se puede acceder, Protected solo se puede acceder si
// esta dentro de la misma carpeta
// En java se puede utilizar la sobrecarga de metodos siempre y cuando diferencie el tipo de datos
// Puede tener varios constructores

// primero tenemos la clase con sus variables
public class Persoa {
    //declaracion de propiedades primero

    public String nome;
    public String dni;
    public int edade;
    // constructores de la clase
    // no es muy recomendable esta forma
    public Persoa(){
        nome= "NoNome";
        dni= "00000000T";
        edade= 0;
    }

    // Las variables del contructor son variables temporales
    // this es igual que self en python
    // esta forma esta mejor
    public Persoa (String nome, String dni, int edade){
        // esto es una forma de hacerlo
        this.nome= nome;
        this.dni= dni;
        this.edade= edade;
        // en java no hace falta usar self cuando se refiere a una propiedad aunque no es recomendable
        /*nome = nome;
        dni= dni;
        edade=edade;*/

    }
    public String getNome() {
        return this.nome;
    }

    public void setNome() {
        this.nome = nome;
    }
    void main(){
        //Cuando quiero crear un objeto nuevo tengo que usar la palabra reservada new
        Persoa p1 = new Persoa(); // utiliza el primer constructor sin parametros
        Persoa p2 = new Persoa("Adrian", "666666J", 34); // utiliza el segundo constructor con parametros
        System.out.println(p1.nome);
        System.out.println(p2.nome);
    }
}

