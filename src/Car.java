public class Car {

    int gear = 0;

    void start(){
        System.out.println("Car is starting");
        shiftGearUp();
    }

    void stop(){
        System.out.println("Car has stopped");
        gear = 0;
    }

    void shiftGearUp(){
        if(gear < 5)
            gear++;
    }

    void shiftGearDown(){
        if(gear > 0)
            gear--;
    }
}
