package com.labels;

import java.util.ArrayList;

public class BreakToLabel {
//	public static void main(String[] args) {
//
//		loop1: for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//			loop2: for (int i1 = 0; i1 < 5; i1++) {
//				System.out.println(i1);
//				break loop2;
//			}
//		}
//
//	}
	
    public static void main(String args[]) {
    
        int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) {
            middle:
            for (int j = 0; j < 3; j++) {
                inner:
                for (int k = 0; k < 3; k++) {
                    if (k - j > 0) {
                        break middle;
                    }
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

}

