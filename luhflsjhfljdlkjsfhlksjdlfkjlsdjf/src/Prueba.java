public class Prueba {

    int[] numeros= new int[5];

    public Prueba ()
    {
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
    }

    public void mostrarNum(int indice) throws IndexOutOfBoundsException
    {
        if(indice > 4)
        {
            throw new IndexOutOfBoundsException("posicion elegida inexistente");
        }
        else
        {
             System.out.printf("el elemento en la posicion " + indice + " es " + numeros[indice]);
        }
    }
}
