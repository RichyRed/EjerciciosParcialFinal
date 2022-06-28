package ejerciciosParcialFinal.ejercicio3;

public class Client {
    public static void main(String[] args){
        CompositeElementos folder1 = new CompositeElementos("Folder1");
        folder1.addElement(new Archivo("Archivo #1").setNroPalabras(32));
        folder1.addElement(new Archivo("Archivo #2").setNroPalabras(18));
        folder1.addElement(new Archivo("Archivo #3").setNroPalabras(21));

        CompositeElementos folder2 = new CompositeElementos("Folder2");
        folder2.addElement(new Archivo("Archivo #4").setNroPalabras(12));
        folder2.addElement(new Archivo("Archivo #5").setNroPalabras(25));
        folder2.addElement(new Archivo("Archivo #6").setNroPalabras(31));

        CompositeElementos unidad1 = new CompositeElementos("Unidad1");
        unidad1.addElement(folder1);
        unidad1.addElement(folder2);

        unidad1.countWords();
    }
}
