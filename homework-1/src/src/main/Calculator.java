public class Calculator {
    private int a;
    private int b;
    private int c;

    public Calculator(int a,int b,int c) {
        this.a = a;
        this.b=b;
        this.c=c;
    }

    public Calculator() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getMax() {

        if (a == b && b == c)
            System.out.println("Please introduce different values");

        return Math.max(a, Math.max(b, c));

    }

    public int getMin() {
        return Math.min(a, Math.max(b, c));
    }

    public int getSum() {
        return a + b + c;
    }

    public double getAverage() {
        return getSum() / 3;
    }

    public boolean areAllPositive() {
        if ((a & b) > 0 && c>0) {
            return true;
        }
        return false;
    }

    public boolean isAEven() {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }
}


