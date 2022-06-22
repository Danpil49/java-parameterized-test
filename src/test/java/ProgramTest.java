import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class ProgramTest {

    @RunWith(Parameterized.class)
    public static class CheckIsAdultTest {

        private final int age;
        private final boolean result;

        public CheckIsAdultTest(int age, boolean result) {
            this.age = age;
            this.result = result;
        }

        @Parameterized.Parameters(name = "{index}: age = {0},  result = {1}")
        public static Object[][] getTextData() {
            return new Object[][] {
                    {18, true},
                    {17, false},
                    {19, true},
                    {21, true}

            };
        }

        @Test
        public void checkIsAdultWhenAgeThenResult() {
            Program program = new Program();
            boolean isAdult = program.checkIsAdult(age);
            assertEquals("Ошибка проверки возраста, при возрасте " + age + " результат равен " + isAdult + ", а должен был бать равен " + result, result, isAdult);
        }
    }
}