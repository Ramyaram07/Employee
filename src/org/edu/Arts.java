package org.edu;

public class Arts extends Education {
	public void bsc() {
		System.out.println("BSC:60 Students");
	}
	public void bEd() {
		System.out.println("B.ED:20 Students");
	}
	public void ba() {
		System.out.println("BA:15 Students");
	}
	public void bba() {
		System.out.println("BBA:40 Students");
	}
	public void ug() {
			System.out.println("UG:200 Students");
		}
	public void pg() {
			System.out.println("PG:300 Students");
		}	
	
	public static void main(String[] args) {
		Arts c = new Arts();
		c.bsc();
		c.bEd();
		c.ba();
		c.bba();
		c.ug();
		c.pg();
		}
}
