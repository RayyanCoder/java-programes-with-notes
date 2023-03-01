

class AeroPlane {

    public void takeoff(){
        System.out.println("Plane is taking off");
    }
    public void fly(){
        System.out.println("Plane is flying");
    }
}

class CargoPlane extends AeroPlane{

    public void takeoff(){
        System.out.println("Cargo  Plane is taking off");
    }
    public void fly(){
        System.out.println("Cargo  Plane is flying");
    }

}
class Passenger extends AeroPlane{

    public void takeoff(){
        System.out.println("Passenger Plane is taking off");
    }
    public void fly(){
        System.out.println("Passenger Plane is flying");
    }
    
}

class FighterPlane extends AeroPlane{

    public void takeoff(){
        System.out.println("Fighter Plane is taking off");
    }
    public void fly(){
        System.out.println("Fighter  Plane is flying");
    }
    
}

class AirPort{
    public void poly(AeroPlane ref){
        System.out.println("******************Run Time Polymorphisam **************** ");
        ref.fly();
        ref.takeoff();
    }
}

class RunTimePloy{
    public static void main(String[] args){
        CargoPlane p = new CargoPlane();
        Passenger pas = new Passenger();
        FighterPlane fp = new FighterPlane();

        //one method of doing run time polymorphisam
        p.fly();
        p.takeoff();

        pas.fly();
        pas.takeoff();

        fp.fly();
        fp.takeoff();

        AeroPlane s1 = new CargoPlane();
        s1.fly();
        s1.takeoff();

        AirPort air = new AirPort();
        air.poly(p);
        air.poly(pas);
        air.poly(fp);




    }
}

