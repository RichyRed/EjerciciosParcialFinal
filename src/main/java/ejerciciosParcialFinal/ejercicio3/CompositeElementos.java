package ejerciciosParcialFinal.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class CompositeElementos extends Component {
    private List<Component> componentList = new ArrayList<>();
    int palabrasEnTotal = 0;

    public CompositeElementos(String tipoArchivo) {
        super(tipoArchivo);
    }

    @Override
    public void countWords() {
        System.out.println(">>> Composite =" + getTipoArchivo());
        for(Component c : componentList) {
            c.countWords();
            palabrasEnTotal = palabrasEnTotal + c.getNroPalabras();
        }
        if(this.getTipoArchivo().startsWith("Folder")){
            this.setNroPalabras(palabrasEnTotal);
            System.out.println("Palabras dentro del folder = " + palabrasEnTotal);
        } else if (this.getTipoArchivo().startsWith("Unidad1")){
            this.setNroPalabras(palabrasEnTotal);
            System.out.println("Palabras en el disco = " + palabrasEnTotal);
        }
    }

    @Override
    public void addElement(Component component) {
        componentList.add(component);
    }

    @Override
    public void removeElement(Component component) {
        componentList.remove(component);
    }
}
