package com.xl.thread;

public class DeadLock {

	public static void main(String[] args) {
		final Object obj1 = new Object();
		final Object obj2 = new Object();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {

				synchronized (obj1) {
					System.out.println("thread 1 -- lock obj1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (obj2) {
						System.out.println("thread 1 -- lock obj2");
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {

				synchronized (obj2) {
					System.out.println("thread 2 -- lock obj2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (obj1) {
						System.out.println("thread 2 -- lock obj1");
					}
				}
			}
		});


		t1.start();
		t2.start();

	}

}
