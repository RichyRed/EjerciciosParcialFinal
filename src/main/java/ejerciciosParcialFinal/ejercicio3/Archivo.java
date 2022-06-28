package ejerciciosParcialFinal.ejercicio3;

public class Archivo extends Component {

    public Archivo(String tipoArchivo) {
        super(tipoArchivo);
    }

    @Override
    public void countWords() {
        System.out.println("Numero de palabras en el " + getTipoArchivo() + "=" + getNroPalabras());
    }

    @Override
    public void addElement(Component component) {
    }

    @Override
    public void removeElement(Component component) {
    }
}
