package com.rameshify.designpatterns;

/**
 * Singleton Design Pattern.
 * Singleton has one and only one instance at any given point.
 * @author Ramesh Sakibanda
 *
 */
public class Singleton {

	private static Singleton instance;
	
	/**
	 * Get an instance of {@link Singleton}.
	 * @return {@link Singleton} object
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
