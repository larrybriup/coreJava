package com.briup.ch04;

public class HalfSearch {
	// 二分查找,又称为折半查找
	//如果返回key表示找到了.如果返回0表示没有找到

	public static int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public static int search(int key) {
		int min, mid, max;
		min = 0;
		max = a.length - 1;
		while (true) {
			mid = (min + max) / 2;
			if (key == a[mid]) {
				System.out.println("找到了:" + key + "在 " + (mid + 1) + "的位置");
				return key;
			} else if (min > max) {
				System.out.println("没有找到:" + key);
				return 0;
			} else if (key < a[mid]) {
				max = mid - 1;
			} else if (key > a[mid]) {
				min = mid + 1;
			}

		}
	}

	public static void main(String[] args) {
		HalfSearch hs = new HalfSearch();
		hs.search(2);
		// System.out.println(hs.search(5));
		hs.search(88);
	}

}
