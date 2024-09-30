package OOP_Courses;

class Fraction10 extends Number {
    int num, denum;

    public Fraction10 (int num, int denum) {
        this.num = num;
        this.denum = denum;
    }
    @Override
    public String toString() {
        return num + "/" + denum;
    }
    @Override
    public int intValue() {
        return (int) (num / (double) denum);
    }
    @Override
    public long longValue() {
        return (long) (num / (double) denum);
    }
    @Override
    public float floatValue() {
        return (float) (num / (double) denum);
    }
    @Override
    public double doubleValue() {
        return num / (double) denum;
    }
    public static void main(String[] args) {
        Fraction10 fraction = new Fraction10(3, 4);
        System.out.println("Дробь: " + fraction.toString());
        System.out.println("intValue: " + fraction.intValue());
        System.out.println("longValue: " + fraction.longValue());
        System.out.println("floatValue: " + fraction.floatValue());
        System.out.println("doubleValue: " + fraction.doubleValue());
    }
}
