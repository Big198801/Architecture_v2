import java.util.ArrayList;

public class GeometryFigure {
    private static ArrayList<IShape> toolbox;

    public GeometryFigure() {
        toolbox = new ArrayList<>();
    }

    public void add(IShape figure){
        toolbox.add(figure);
    }
    public IShape getFigure(int position){
        if (position > toolbox.size()){
            throw new IndexOutOfBoundsException("выход за пределы массива");
        }
        return toolbox.get(position);
    }

    public void deleteFigure(int position){
        if (position > toolbox.size()){
            throw new  IndexOutOfBoundsException("выход за пределы массива");
        }
        toolbox.remove(position);
    }

    public void getFiguresInfo(){
        for (IShape fig: toolbox
             ) {
            System.out.printf("%.3f  %.3f \n",fig.getArea(), fig.getPerimeter());

        }
    }
}
