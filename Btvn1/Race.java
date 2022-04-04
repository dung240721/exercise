package Btvn1;

public class Race {
    public static void main(String a[]) {
        //create an array of runnable RaceCar objects
        RaceCar[] cars = new RaceCar[5];
        cars[0] = new RaceCar(10, "Ironman" );
        cars[1] = new RaceCar(10, "Blackpanter");
        cars[2] = new RaceCar(10, "Spiderman");
        cars[3] = new RaceCar(10, "DoctorStraeng");
        cars[4] = new RaceCar(10, "MoonNight");


        //start racing
        for (int i = 0; i < 5; i++)
            cars[i].start();
    }
}
