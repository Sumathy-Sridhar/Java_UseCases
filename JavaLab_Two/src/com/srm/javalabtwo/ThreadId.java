package com.srm.javalabtwo;

import java.util.logging.Logger;

public class ThreadId implements Runnable {
	static Logger log=Logger.getLogger(ThreadId.class.getName());
	   Thread t;
	   ThreadId() {
	      t = new Thread(this, "Thread Test");
	      t.setPriority(1);
	      log.info("thread  = " + t);
	      t.start();
	   }

	public static void main(String[] args) {
	
		new ThreadId();
	}

	@Override
	public void run() {
		   log.info("Thread Name = " + t.getName());
		   log.info("Thread Id = " + t.getId());
	}

}
