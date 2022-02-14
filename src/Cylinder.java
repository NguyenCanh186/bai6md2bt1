public class Cylinder extends Circle{
    private double h  = 1;
    public Cylinder(){
    }
    public Cylinder(double r, double h, String color){
        super(r, color);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getAreaCylinder(){
        return getArea() * h;
    }
    @Override
    public String toString(){
        return "hinh tru co chieu cao la "
                + getH()
                + " va co dien tich la "
                + getAreaCylinder()
                + " no la lop con cua "
                + super.toString();
    }

}
