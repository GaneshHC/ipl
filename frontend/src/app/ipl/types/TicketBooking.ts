<<<<<<< HEAD
import { Match } from "./Match";

export class TicketBooking {

    bookingId: number;
    email: string;
    match: Match;
    numberOfTickets: number;

    constructor(
        bookingId: number,
        email: string,
        match: Match,
        numberOfTickets: number
    ) {
        this.bookingId = bookingId;
        this.email = email;
        this.match = match;
        this.numberOfTickets = numberOfTickets;
    }

    displayInfo() {
        console.log(`Booking ID: ${this.bookingId}`);
        console.log(`Email: ${this.email}`);
        console.log(`Number of Tickets: ${this.numberOfTickets}`);
    }
=======
export class TicketBooking {
   
    bookingId:number;
    email:string;
    matchId:number;
    numberOfTickets:number;
 
   
 
 
    constructor(    bookingId:number,
        email:string,
        matchId:number,
        numberOfTickets:number){
        this.bookingId=bookingId;
          this.email=email;
          this.matchId=matchId;
          this.numberOfTickets=numberOfTickets;
         
 
         
      }
 
      displayInfo(){
          console.log(`Booking ID: ${this.bookingId}`);
          console.log(`Email: ${this.email}`);
          console.log(`Number Of Tickets: ${this.numberOfTickets}`);
      }
 
 
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
}