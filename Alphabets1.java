package com.xworkz.xworkzapp.aptitude.nikunj.alphabet;
public class Alphabets1 {
	public static void main(String a[]) {
		aAlphabet();
		System.err.println();
		bAlphabet();
		System.out.println();
		cAlphabet();
		System.out.println();
		dAlphabet();
		System.out.println();
		eAlphabet();
		System.out.println();
		fAlphabet();
		System.out.println();
		gAlphabet();
		System.out.println();
		hAlphabet();
		System.out.println();
		iAlphabet();
		System.out.println();
		jAlphabet();
		System.out.println();
		kAlphabet();
		System.out.println();
		//lAlphabet();
		mAlphabet();
		System.out.println();
		nAlphabet();
		System.out.println();
		oAlphabet();
		System.out.println();
		pAlphabet();
		System.out.println();
		qAlphabet();
		System.out.println();
		rAlphabet();
		System.out.println();
		sAlphabet();
		System.out.println();
		tAlphabet();
		System.out.println();
		uAlphabet();
		System.out.println();
		vAlphabet();
		System.out.println();
		wAlphabet();
		System.out.println();
		xAlphabet();
		System.out.println();
		yAlphabet();
		System.out.println();
		zAlphabet();
	}

	public static void aAlphabet() {
		int n = 7, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == mid || j - i == mid || i == mid || j == 0 && i != 0 && mid < i || j == n - 1 && mid < i) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

	public static void bAlphabet() {
		int n = 7, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j != n - 1 || j == 0 || i == n - 1 && j != n - 1 || i == mid
						|| j == n - 1 && i != 0 && i != (n - 1)) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

	public static void cAlphabet() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == (n - 1)) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

	public static void dAlphabet() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j != (n - 1) || j == 0 || i == (n - 1) && j != (n - 1)
						|| j == (n - 1) && i != 0 && i != (n - 1)) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void eAlphabet() {
		int n = 9, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == mid || i == (n - 1)) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void fAlphabet() {
		int n = 9, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == mid) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void gAlphabet() {
		int n = 7, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && mid >= j || j == 0 || i == (n - 1) && mid >= j || mid == j && mid <= i
						|| mid == i && mid < j || j == (n - 1) && mid <= i) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void hAlphabet() {
		int n = 7, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == mid || j == 0 || j == (n - 1)) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void iAlphabet() {
		int n = 9, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == mid || i == n - 1) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void jAlphabet() {
		int n = 7, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == mid || i == (n - 1) && mid >= j || j == 0 && mid <= i) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void kAlphabet() {
		int n = 5, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i + j == mid || i - j == mid) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void mAlphabet() {
		int n = 9, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j && mid >= i || i + j == n - 1 && mid >= i || j == n - 1) {
					System.out.print("*  ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void nAlphabet() {
		int n = 9;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == (n - 1)) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void oAlphabet() {
		int n = 7;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 && i != 0 && i != (n - 1) || i == 0 && j != 0 && j != n - 1
						|| j == n - 1 && i != 0 && i != n - 1 || i == n - 1 && j != n - 1 && j != 0) {
					System.out.print("*  ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void pAlphabet() {
		int n = 9, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == mid || j == n - 1 && mid >= i) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void qAlphabet() {
		int n = 5, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 && i != n - 1 && mid >= i || i == 0 && j != 0 && mid >= j || mid == j && mid >= i
						|| mid == i && mid >= j || i == j && mid <= i) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void rAlphabet() {
		int n = 5, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == mid && j != n - 1 || j == n - 1 && i != mid) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void sAlphabet() {
		int n = 7, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 && i != 0 && mid >= i || i == 0 && j != 0 || mid == i || j == n - 1 && mid < i && i != n - 1
						|| i == n - 1 && j != n - 1) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void tAlphabet() {
		int n = 7, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == mid) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}
	public static void uAlphabet() {
		int n = 7, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 && i != n - 1 || j == n - 1 && i != n - 1 || i == n - 1 && j != 0 && j != n - 1) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

	public static void vAlphabet() {
		int n = 7, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i && mid > i || i + j == n - 1 && mid >= i) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void wAlphabet() {
		int n = 7, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j && mid <= i || i + j == n - 1 && mid >= j) {
					System.out.print("*  ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void xAlphabet() {
		int n = 7, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
	}

	public static void yAlphabet() {
		int n = 7, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j && mid >= i || i + j == n - 1 && mid >= i || j == mid && mid <= i) {
					System.out.print("*  ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();
		}
	}
	public static void zAlphabet() {
		int n = 11, mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i + j == n - 1 || i == n - 1) {
					System.out.print("*  ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}