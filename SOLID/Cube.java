public class Cube implements Shape, ThreeDimensionalShape{
    
    private final int len;

    public Cube(int len){
        this.len = len;
    }

    public int getLength(){
        return len;
    }
    @Override
    public double area(){
        return len * len * 6;
    }

    @Override
    public double volume(){
        return Math.pow(getLength(), 3);
    }
}