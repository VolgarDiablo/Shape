public abstract class Shape implements Cloneable{
    public abstract String getDescription();

    public abstract String getName();

    public abstract double getArea();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
