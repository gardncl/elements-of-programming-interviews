import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class DeadlockTest {

    @Test
    public void test() {
        Deadlock.Account ben = new Deadlock.Account(1000);
        Deadlock.Account greg = new Deadlock.Account(800);
        Deadlock.Account liam = new Deadlock.Account(400);
        Deadlock.Account billy = new Deadlock.Account(200);

        IntStream.range(0,200).forEach(i -> {
            Deadlock.Account.transfer(ben, liam, 1);
            Deadlock.Account.transfer(ben, billy, 2);
            Deadlock.Account.transfer(greg, liam, 3);
            Deadlock.Account.transfer(liam, billy, 1);
        });

        assertEquals(400,ben.getBalance());
        assertEquals(200,greg.getBalance());
        assertEquals(1000,liam.getBalance());
        assertEquals(800,billy.getBalance());
    }

}