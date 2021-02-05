class Vehicle{
    public int speed;
    public String color;

    public Vehicle(){
        this.speed = 0;
        this.color = "Grey";
    }

    public Vehicle(int newSpeed, String newColor){
        this.speed = newSpeed;
        this.color = newColor;
    }

    public int speedUp(int increment){
        this.speed += increment;
        return this.speed;
    }

    public int goSlower(int decrement){
        this.speed -= decrement;
        return this.speed;
    }

    public String toString(){
        return "This vehicle is " + color + "and is traveling at a speed of " + speed + "miles per hour";
    }
}