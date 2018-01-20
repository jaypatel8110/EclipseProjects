package com.patterns;

public class J {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i == 0) {
				int h = 0;
				while (h < 14) {
					System.out.print("*");
					h++;
				}
			} else {
				if (i == 8 || i == 9 || i == 10) {
					for (int k = 0; k < 4; k++) {
						System.out.print(" ");
					}
				} else {
					for (int k = 0; k < 7; k++) {
						System.out.print(" ");
					}
				}
				if (i == 8 || i == 9 || i == 10) {
					for (int k = 0; k < 1; k++) {
						System.out.print("*");
					}
					if (i == 10) {

					} else {
						for (int k = 0; k < 2; k++) {
							System.out.print(" ");
						}
					}
					if (i == 10) {
						for (int k = 0; k < 3; k++) {
							System.out.print("*");
						}
					} else {
						for (int k = 0; k < 1; k++) {
							System.out.print("*");
						}
					}

				} else {

					for (int k = 0; k < 1; k++) {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
