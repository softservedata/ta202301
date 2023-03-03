package com.softserve.edu10ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {

    public static void mySleep(long milisec) throws InterruptedException {
        Thread.sleep(milisec);
    }

    public static int m1() {
		System.out.println("start m1()");
        int i = 0;
		try {
			i = 10 / i;
		} catch (ArithmeticException e) {
			System.out.println("message = " + e.getMessage());
		}
		System.out.println(" i = " + i);
		return 0;
    }

    public static int div() { //throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("n=");
            int n = Integer.parseInt(br.readLine());
            System.out.print("k=");
            int k = Integer.parseInt(br.readLine());
            if (k == -1) {
                throw new Exception("hahaha");
            }
            return n / k;
        } catch (NumberFormatException | IOException e) {
            System.out.println("NumberFormatException | IOException");
            return -1;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            //System.exit(0);
            return -2;
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println("message = " + e.getMessage());
//			if (br != null) {
//				throw e;
//			}
            return -3;
        } finally {
            System.out.println("finally");
            try {
                br.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static int div2() { //throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("n=");
            int n = Integer.parseInt(br.readLine());
            System.out.print("k=");
            int k = Integer.parseInt(br.readLine());
            if (k == -1) {
                throw new Exception("hahaha");
            }
            return n / k;
        } catch (NumberFormatException | IOException e) {
            System.out.println("NumberFormatException | IOException");
            return -1;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            //System.exit(0);
            return -2;
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println("message = " + e.getMessage());
//			if (br != null) {
//				throw e;
//			}
            return -3;
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        System.out.println("Statr");
        m1();
        try {
			//m1();
            mySleep(2000);
            System.out.println("div = " + div2());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("ERROR InterruptedException");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("ERROR Exception");
        }
        System.out.println("done");
    }
}
