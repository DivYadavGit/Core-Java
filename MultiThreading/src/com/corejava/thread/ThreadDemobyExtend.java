package com.corejava.thread;

class Demo extends Thread
{
	private int threadNo;

	public Demo(int threadno)
	{
		this.threadNo = threadno;
	}

	@Override
	public void run()
	{
		counter();
	}

	public void counter()
	{
		for (int i = 1; i <= 10; i++)
		{
			try
			{
				sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("The value of I is = " + i + " and the thread No is = " + threadNo);
		}
	}
}

public class ThreadDemobyExtend
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo(1);
		Demo d2 = new Demo(2);

		// Execute methods as normal class
		// long startTime = System.currentTimeMillis();
		// d1.counter();
		// System.out.println("-----------------------------------------------------");
		// d2.counter();
		// long endTime = System.currentTimeMillis();
		// System.out.println("Total time required for called counter() : " +
		// (endTime - startTime) + " milliSec");

		// Execute class as thread class but not simultaneously
		// long startTime = System.currentTimeMillis();
		// d1.run();
		// System.out.println("-----------------------------------------------------");
		// d2.run();
		// long endTime = System.currentTimeMillis();
		// System.out.println("Total time required for called counter() : " +
		// (endTime - startTime) + " milliSec");

		// Execute class as thread simultaneously.
		long startTime = System.currentTimeMillis();
		d1.start();
		System.out.println("-----------------------------------------------------");
		d2.start();
		try
		{
			// Add sleep() to get total required time
			Thread.sleep(11000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time required for called counter() : " + (endTime - startTime) + " milliSec");
	}

}
