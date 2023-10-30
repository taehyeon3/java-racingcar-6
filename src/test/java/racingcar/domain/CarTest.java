package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CarTest {

    @ParameterizedTest
    @CsvSource({"pobi", "woni", "jun"})
    void 자동차에_이름_부여(String result) {
        Car car = new Car(result);

        assertThat(result).isEqualTo(car.getName());
    }

    @ParameterizedTest
    @CsvSource({"3,0", "4,1"})
    void 숫자가_4이상이면_자동차를_전진(int number, int result) {
        Car car = new Car("pobi");

        car.moveForward(number);

        assertThat(result).isEqualTo(car.getMileage());
    }
}