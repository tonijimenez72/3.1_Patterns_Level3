package n1exercise3.service;

import n1exercise3.model.Vehicle;

public class Brake implements Command {
    private final Vehicle vehicle;

    public Brake(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        System.out.println(vehicle + "'s braking.");
    }
}
