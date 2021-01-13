//Tanachok Doungsatan 632115020


public class ciecle {

    public static void circle1() {
        double r = 2.0;
        System.out.println("Area of circle1 is   :" + Math.PI * r * r);
        System.out.println("Circumference of circle1 is  :" + 2 * Math.PI * r);

    }

    public static void circle2() {
        double r = 3.0;
        System.out.println("Area of circle2 is   :" + Math.PI * r * r);
        System.out.println("Circumference of circle2 is  :" + 2 * Math.PI * r);

    }

    public static void circle3() {
        double r = 1.0;
        System.out.println("Area of circle3 is  :" + Math.PI * r * r);
        System.out.println("Circumference of circle3 is  :" + 2 * Math.PI * r);

    }

    public static void circle4() {
        double r = -1.0;
        if (r < 0) {
            System.out.println("Area of circle4 is : 0");
            System.out.println("Circumference of circle4 is : 0");
        }

    }

    public static void intersec12() {
        double x1 = 0.0;
        double x2 = 1.0;
        double y1 = 0.0;
        double y2 = 2.0;
        double r1 = 2.0;
        double r2 = 3.0;
        double line;
        double rang;
        rang = (r1 + r2);
        line = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        if (line < rang) {
            System.out.println("Is circle 1 intersec circle 3: True");

        } else {
            System.out.println("Is circle 1 intersec circle 3: False");
        }
    }

    public static void intersec13() {
        double x1 = 0.0;
        double x2 = 3.0;
        double y1 = 0.0;
        double y2 = 5.0;
        double r1 = 2.0;
        double r2 = 1.0;
        double line;
        double rang;
        rang = (r1 + r2);
        line = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        if (line < rang) {
            System.out.println("Is circle 1 intersec circle 3: True");

        } else {
            System.out.println("Is circle 1 intersec circle 3: False");
        }

    }

}
