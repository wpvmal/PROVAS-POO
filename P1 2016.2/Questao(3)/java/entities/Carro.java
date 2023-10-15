package entities;

public class Carro {
    private int id;
    private Motor motor;

    public Carro() {
    }

    public Carro(int id, Motor motor) {
        this.id = id;
        this.motor = motor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Motor getMotor() {
        return motor;
    }
    
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
