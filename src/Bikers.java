/*Five Bikers Compete in a race such that they drive at
  a constant speed which may or may not be the same as
  the other. To qualify the race, the speed of a racer must
  be more than the average speed of all 5 racers. Write a
  Java program to take as input the speed of each racer
  and print back the speed of qualifying racers.*/

public class Bikers {
    public static void main(String [] args)
    { float sp1 = 100, sp2 = 120, sp3 = 95 , sp4 = 130, sp5 =100;
        float avg;
        //sp1, sp2, sp3, sp4, sp5 are the speed of the bike in the race.
        avg = (sp1+sp2+sp3+sp4+sp5)/5;
        System.out.println("Average speed is = "+avg);

        if (sp1>avg)
            System.out.println("Racer 1 has qualified.");
        if (sp2>avg)
            System.out.println("Racer 2 has qualified.");
        if (sp3>avg)
            System.out.println("Racer 3 has qualified.");
        if (sp4>avg)
            System.out.println("Racer 4 has qualified.");
        if (sp5>avg)
            System.out.println("Racer 5 has qualified.");
    }
}
