package com.demo.t2;

import java.util.Arrays;

public class FlipingImage {

	public static void main(String[] args) {
		int[][]image={{1,1,0},{1,0,1},{0,0,0}};
		// TODO Auto-generated method stub
		for (int i = 0; i < image.length; i++) {
			int front = i;
			int rear = image.length - 1;
			while (front < rear) {
				int temp = image[i][front];
				image[i][front] = image[i][rear];
//				if (image[i][front] == 0) {
//					image[i][front] = 1;
//				} else {
//					image[i][front] = 0;
//				}
				image[i][rear] = temp;
//				if (image[i][rear] == 0) {
//					image[i][rear] = 1;
//				} else {
//					image[i][rear] = 0;
//				}
				front++;
				rear--;
				System.out.println(Arrays.toString(image[i]));
			}
		}
//		for(int i=0;i<image.length;i++) {
//			for(int j=0;j<image[i].length;j++) {
//				System.out.print(image[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

}
