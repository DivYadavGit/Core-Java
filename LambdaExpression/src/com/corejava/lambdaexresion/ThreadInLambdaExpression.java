package com.corejava.lambdaexresion;

public class ThreadInLambdaExpression
{
	public static void main(String[] args)
	{
		// Create Thread by implementing Runnable interface
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run()
			{
				System.out.println("Thread is working...");
			}
		});
		thread1.start();

		// Create thread by using lambda expression
		Thread thread2 = new Thread(() -> System.out.println("Thread is working with lambda"));
		thread2.start();

		// Create thread w/o create object
		new Thread(() -> {
			System.out.println("Thread is directly working w/o object");
			System.out.println("It's the quickest way to create and start thread.");
		}).start();
	}

}
