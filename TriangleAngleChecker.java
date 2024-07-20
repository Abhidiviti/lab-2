public class TriangleAngleChecker {
    public static void main(String[] args) {
        int angle1 = 80;
        int angle2 = 45;
        int angle3 = 55;
       if((angle1+angle2+angle3)==180&&angle2>0&&angle1>0&&angle3>0)
        System.out.println("its a triangle");
       else
        System.out.println("its not a triangle");

    }
}
