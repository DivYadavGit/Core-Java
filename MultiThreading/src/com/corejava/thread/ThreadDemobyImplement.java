package com.corejava.thread;

class DemoThread implements Runnable
{
	private int threadNo;

	public DemoThread(int threadNo)
	{
		this.threadNo = threadNo;
	}

	@Override
	public void run()
	{
		for (int i = 1; i < 10; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Value of i: " + i + ", Thread number is : " + threadNo);
		}
	}

}

public class ThreadDemobyImplement
{
	public static void main(String[] args)
	{
		Thread thread1 = new Thread(new DemoThread(1));
		Thread thread2 = new Thread(new DemoThread(2));

		thread1.start();
		thread2.start();

		// Create anonymous object of thread by implementing runnable
		new Thread(new Runnable() {

			@Override
			public void run()
			{
				for (int i = 0; i < 10; i++)
				{
					try
					{
						Thread.sleep(500);
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Value of i:" + i);
				}
			}
		}).start();
	}

}
