public class Circle {
    private int SemiAxisX;
    private int SemiAxisY;

    public Circle(){
        SemiAxisX=SemiAxisY=0;
    }

    public Circle(int semiAxisX, int semiAxisY) {
        this.SemiAxisX = semiAxisX;
        this.SemiAxisY = semiAxisY;
    }

    public void setBoundingBox (int heightBB, int widthBB){
        this.SemiAxisX=heightBB;
        this.SemiAxisY=widthBB;
    }
}
