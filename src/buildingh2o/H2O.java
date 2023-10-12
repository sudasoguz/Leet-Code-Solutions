package buildingh2o;

import java.util.concurrent.Semaphore;

class H2O {

    Semaphore hSemaphore;
    Semaphore oSemaphore;

    public H2O() {
        hSemaphore = new Semaphore(2);
        oSemaphore = new Semaphore(0);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        hSemaphore.acquire();
        releaseHydrogen.run();
        oSemaphore.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oSemaphore.acquire(2);
        releaseOxygen.run();
        hSemaphore.release(2);
    }
}