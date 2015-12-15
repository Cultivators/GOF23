package cn.cultivator.singleton;

import java.util.concurrent.CountDownLatch;

public class Client_2 {
	public static void main(String[] args)throws Exception {
		int count = 40;
		long start = System.currentTimeMillis();
		
		final CountDownLatch c = new CountDownLatch(count);
		for(int j = 0;j<count;j++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i=0;i<1000000;i++){
						Singleton_4.getInstance();
					}
					c.countDown();
				}
			}).start();
		}
		c.await();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
	}
}
