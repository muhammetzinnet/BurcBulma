package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int gun, ay;
        String burc = "";
        boolean isError = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı secin = ");
        ay = scanner.nextInt();

        System.out.print("Doğduğunuz günü giriniz = ");
        gun = scanner.nextInt();

        if (ay ==1){
            if (gun>=1 && gun<=31){
                if (gun<21){
                    burc="Oğlak";
                }else {
                    burc="Kova";
                }
            }
        }else if (ay==2){
            if (gun>=1 && gun<=28){
                if (gun<19){
                    burc="Kova";
                }else {
                    burc="Balık";
                }
            }
        }else if (ay==3){
            if (gun>=1 && gun<=31){
                if (gun<20){
                    burc="Balık";
                }else {
                    burc="Koç";
                }
            }
        }else if (ay==4){
            if (gun>=1 && gun<=30){
                if (gun<20){
                    burc="koç";
                }else {
                    burc="Boğa";
                }
            }
        }else if (ay==5){
            if (gun>=1 && gun<=31){
                if (gun<21){
                    burc="Bağa";
                }else {
                    burc="İkizler";
                }
            }
        }else if (ay==6){
            if (gun>=1 && gun<=30){
                if (gun<22){
                    burc="İkizler";
                }else {
                    burc="Yengeç";
                }
            }
        }else if (ay==7){
            if (gun>=1 && gun<=31){
                if (gun<23){
                    burc="Yengeç";
                }else {
                    burc="Aslan";
                }
            }
        }else if (ay==8){
            if (gun>=1 && gun<=31){
                if (gun<23){
                    burc="Aslan";
                }else {
                    burc="Başak";
                }
            }
        }else if (ay==9){
            if (gun>=1 && gun<=30){
                if (gun<23){
                    burc="Başak";
                }else {
                    burc="Terazi";
                }
            }
        }else if (ay==10){
            if (gun>=1 && gun<=31){
                if (gun<23){
                    burc="Terazi";
                }else {
                    burc="Akrep";
                }
            }
        }else if (ay==11){
            if (gun>=1 && gun<=30){
                if (gun<22){
                    burc="Akrep";
                }else {
                    burc="Yay";
                }
            }
        }else if (ay==12){
            if (gun>=1 && gun<=30){
                if (gun<22){
                    burc="Yay";
                }else {
                    burc="Oğlak";
                }
            }
        }else {
            isError=true;
        }

        if (isError){
            System.out.println("Hatalı giriş tekrar deneyin...");
        }else {
            System.out.println("Burcunuz = " + burc);
        }
    }
}
