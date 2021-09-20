class subject{

    double math;
    double eng;
    double sci;
    double ss;
    double marathi;
};

public class Student {
    public static  void main(String args[]) {

        subject a = new subject();
        double avg;

        a.math = 18;
        a.eng = 17;
        a.sci = 20;
        a.ss = 16;
        a.marathi = 18;


        avg = (a.math + a.eng + a.sci + a.ss + a.marathi) / 5;

        System.out.println("average score= " + avg);
    }
}