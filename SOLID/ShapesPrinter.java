import java.util.List;

public class ShapesPrinter{

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator){
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes){
        return String.format("{Shapes sum: %d}", areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes){
        return String.format("ShapesSum, %d", areaCalculator.sum(shapes));
    }
}