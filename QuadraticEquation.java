
package com.gabi;

import java.util.Scanner;

public  class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        ax2 + bx + c = 0

            System.out.printf("a = ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.printf("b = " );
            double b = -Double.parseDouble(scanner.nextLine());
            System.out.printf("c = ");
            double c = Double.parseDouble(scanner.nextLine());
            double x1 ;
            double x2 ;
            double f = 0;

            if (f==0 && a!=0){
                double D;
                if (b % 2 != 0) {
//                odd
                    System.out.println("b is odd");
                    D = (b/2)*(b/2)-a*c;
//                System.out.printf("(%f/2)*(%f/2)-%f*%f",b,b,a,c);
                    System.out.printf("(%.2f/2)*(%f.2/2)-%.2f*%.2f = %.2f",b,b,a,c,D);
                    System.out.println();
                    if(D<0){
                        System.out.println("The square equation has no real roots.");
                    }else if (D == 0){
                        x1=b/2*a;
                        System.out.println("The equation has 1 real root.");
                        System.out.println();
                        System.out.printf("x =%.2f",x1);
                    }else if (D>0){
                        x1= ((-b/2)+Math.sqrt(D))*a;
                        x2= ((-b/2)-Math.sqrt(D))*a;

//                    x1*=x1;
//                    x2*=x2;
                        System.out.println("The square equation has 2 real roots.");
                        System.out.printf("x = %.2f",x1);
                        System.out.println();
                        System.out.printf("x = %.2f",x2);
                    }
                } else {
//               even
                    System.out.println("b is even");
                    D=b*b-4*a*c;
//                System.out.printf("%f*%f-4*%f*%f=%f",b,b,a,c,D);
                    System.out.printf("%.2f*%.2f-4*%.2f*%.2f=%.2f",b,b,a,c,D);
                    System.out.println();

                    System.out.printf("D= %f",D);
                    System.out.println();
                    if(D<0){
                        System.out.println("The square equation has no real roots.");
                    }else if (D == 0){
                        x1=b/2*a;
                        System.out.println("The equation has 1 real root.");
                        System.out.println();
                        System.out.printf("x = %.2f",x1);
                    }else if (D>0){
                        x1= ((- +Math.sqrt(D))/2*a);
                        x2= ((-b-Math.sqrt(D))/2*a);

//                x1*=x1;
//                x2*=x2;
                        System.out.println("The square equation has 2 real roots.");
                        System.out.printf("x = %.2f",x1);
                        System.out.println();
                        System.out.printf("x = %.2f",x2);
                    }
                }

            }

        }
    }
