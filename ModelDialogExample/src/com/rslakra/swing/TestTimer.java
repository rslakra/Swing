//package com.devamatre.examples.java.quartz;
//
//import javax.swing.SwingUtilities;
//
//import com.devamatre.dsql.Key;
//import com.myrio.common.util.timer.DeadlineTimer;
//
//public class TestTimer {
//	static boolean succeeded = false;
//	
//	public void startTest() {
//		System.out.println("+startTest()");
//		DeadlineTimer timer = DeadlineTimer.getInstance();
////        Key tempKey = timer.setAlarmAfter(3000, 3000, new Runnable() {
//        Key tempKey = timer.setAlarmAfter(System.currentTimeMillis(), 3000, new Runnable() {
//        	public void run() {
//    			System.out.println("succeeded : " + succeeded);
//        		if(!succeeded) {
//        			System.out.println("Timer Thread Called!!!");
//        			succeeded = true;
////        			result = 0; //TODO: Can send some error code here?
//        		}
//        	}
//        });
//        
//        TestThread testThread = new TestThread();
//        SwingUtilities.invokeLater(testThread);
//
//        while(!succeeded) {
//        	try {
//        		Thread.sleep(500L);
//        	}catch(InterruptedException ie) {
//        		
//        	}
//        }
//        
//        System.out.println("succeeded ===> : " + succeeded);
//        if(succeeded) {
//        	timer.cancelAlarm(tempKey);
//        	timer = null;
//        	tempKey = null;
//        	try {
//        		testThread.stop();
//        	}catch(Exception  ex) {
//        		System.err.println("error while stopping mpeg thread, ex : " + ex);
//        		ex.printStackTrace();
//        	}
//        	testThread = null;
//        }
//		System.out.println("-startTest()");
//	}
//	
//	public static void main(String[] args) {
//		TestTimer testTimer = new TestTimer();
//		testTimer.startTest();
//	}
//	
//	public class TestThread extends Thread {
//		
//		public TestThread() {
//			super("TestThread");
//		}
//		
//		public void run() {
//			while(true) {
//	        	try {
//					System.out.println("TestThread Waiting!");
//	        		Thread.sleep(60000L);
//	        	}catch(InterruptedException ie) {
//					System.out.println("TestThread Interrupted!");
//	        	}
//	        	if(!succeeded) {
//	        		succeeded = true;
//	        	}
//				System.out.println("TestThread Finished!, succeeded : " + succeeded);
//				break;
//			}
//		}
//	}
//}
