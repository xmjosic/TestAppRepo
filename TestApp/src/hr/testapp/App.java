package hr.testapp;

import java.util.Random;

public class App {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				int i, y = 50;
				Random random = new Random();

				i = random.nextInt();

				System.out.println("Random value 1: " + i);

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				int i, y = 20;
				Random random = new Random();

				i = random.nextInt(y);

				System.out.println("Random value 2: " + i);

			}
		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {

				int i, y = 10;
				Random random = new Random();

				i = random.nextInt(y);

				System.out.println("Random value 3: " + i);

			}
		});

		t1.start();
		t2.start();
		t3.start();

	}

}
