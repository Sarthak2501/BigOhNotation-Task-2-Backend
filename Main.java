public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
    }
}

abstract class Box{
    private int length;
    private int height;
    private int width;
    private int area ;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    abstract int TotalCost();

}

interface flute{
    public int totalGsm();

}

class A implements flute{

    @Override
    public int totalGsm() {
        return 0;
    }
}

class B implements flute {

    @Override
    public int totalGsm() {
        return 0;
    }
}

class C implements flute {

    @Override
    public int totalGsm() {
        return 0;
    }
}

class D implements flute {

    @Override
    public int totalGsm() {
        return 0;
    }
}

class E implements flute {

    @Override
    public int totalGsm() {
        return 0;
    }
}

class F implements flute {

    @Override
    public int totalGsm() {
        return 0;
    }
}

class G implements flute {

    @Override
    public int totalGsm() {
        return 0;
    }
}


interface pinsJoin {
    public void pinsToJoin();
}

interface pastJoin {
    public void pasting();
}

class Universal extends Box{

    @Override
    int TotalCost() {
        return 0;
    }
}

class AllFlapMeeting extends Box{

    @Override
    int TotalCost() {
        return 0;
    }
}

class HoneyComb extends Box{

    @Override
    int TotalCost() {
        return 0;
    }
}

class ReverseTuckIn extends Box{

    @Override
    int TotalCost() {
        return 0;
    }
}

class TopOpeningSnapLock extends Box{

    @Override
    int TotalCost() {
        return 0;
    }
}
