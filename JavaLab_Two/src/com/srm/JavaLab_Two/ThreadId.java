package com.srm.JavaLab_Two;

public class ThreadId implements Runnable {
	   Thread t;
	   ThreadId() {
	      t = new Thread(this, "Thread Test");
	      t.setPriority(1);
	      System.out.println("thread  = " + t);
	      t.start();
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadId();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		   System.out.println("Thread Name = " + t.getName());
		   System.out.print("Thread Id = " + t.getId());
	}

}
