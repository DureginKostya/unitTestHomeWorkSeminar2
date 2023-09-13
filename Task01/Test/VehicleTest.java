import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car = new Car("BMW", "M6", 2023);
    Motorcycle motorcycle = new Motorcycle("Yamaha", "505 SX-F", 2007);

    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testMotorcycleIsInstanceOfVehicle() {
        assertTrue(motorcycle instanceof Vehicle);
    }

    @ParameterizedTest
    @ValueSource(ints = 4)
    public void carCreateWithFourWheels(int i) {
        assertTrue(i == car.getNumWheels());
    }

    @ParameterizedTest
    @ValueSource(ints = 2)
    public void motorcycleCreateWithFourWheels(int i) {
        assertTrue(i == motorcycle.getNumWheels());
    }

    @Test
    public void speedCarTestDrive() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void speedMotorcycleTestDrive() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void speedCarParking() {
        car.testDrive();
        car.park();
        assertEquals(0,car.getSpeed());
    }

    @Test
    public void speedMotorcycleParking() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
