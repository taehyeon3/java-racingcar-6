package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Race {
    private final List<Car> cars;
    private final int moveCount;

    public Race(List<String> carNames, int moveCount) {
        cars = new ArrayList<>();
        for (String Name : carNames) {
            cars.add(new Car(Name));
        }
        this.moveCount = moveCount;
    }

    private void moveCar() {
        for (Car car : cars) {
            car.moveForward();
            Output.printCar(car);
        }
        System.out.println();
    }

    public void start() {
        System.out.println("\n실행결과");
        for (int i = 0; i < moveCount; ++i) {
            moveCar();
        }
    }

    public void evaluate() {
        List<String> winners = new ArrayList<>();
        int maxMileage = Collections.max(cars).getMileage();
        for (Car car : cars) {
            if (car.getMileage() == maxMileage) {
                winners.add(car.getName());
            }
        }
        Output.printWinners(winners);
    }
}
