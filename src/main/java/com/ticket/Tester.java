package com.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station? 1)Taipei 2)Taichung 3)Kaohsiung");
        Station start= null;
        int choice = Integer.parseInt(scanner.next());
        switch (choice){
            case 1:
                start=Station.TAIPEI_STATION;
                break;
            case 2:
                start=Station.TAICHUNG_STATION;
                break;
            case 3:
                start=Station.KAOHSIUNG_STATION;
                break;

        }
        System.out.println("Your destination station? 1)Taipei 2)Taichung 3)Kaohsiung");
        Station destination= null;
        choice = Integer.parseInt(scanner.next());
        switch (choice){
            case 1:
                destination=Station.TAIPEI_STATION;
                break;
            case 2:
                destination=Station.TAICHUNG_STATION;
                break;
            case 3:
                destination=Station.KAOHSIUNG_STATION;
                break;

        }
        System.out.println("Which kind of ticket? 1)Normal ticket 2)Student ticket 3)Elder ticket");
        Ticket tickets= null;
        choice = Integer.parseInt(scanner.next());
        switch (choice){
            case 1:
               tickets=new Ticket(start,destination);
                break;
            case 2:
                tickets=new StudentTicket(start,destination);
                break;
        }
        tickets.print();

    }
}
