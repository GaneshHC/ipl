<<<<<<< HEAD
import { Cricketer } from "./Cricketer";
import { Team } from "./Team";

export class Vote {

    voteId: number;
    email: string;
    category: string;
    cricketer: Cricketer;
    team: Team;

    constructor(
        voteId: number,
        email: string,
        category: string,
        cricketer: Cricketer,
        team: Team
    ) {
        this.voteId = voteId;
        this.email = email;
        this.category = category;
        this.cricketer = cricketer;
        this.team = team;
    }

    displayInfo() {
        console.log(`Vote ID: ${this.voteId}`);
        console.log(`Email: ${this.email}`);
    }
=======
export class Vote {
 
    voteId:number;
    email:string;
    category:string;
    cricketerId:number;
    teamId:number;
 
   
 
 
    constructor( voteId:number,
        email:string,
        category:string,
        cricketerId:number,
        teamId:number){
        this.voteId=voteId;
          this.email=email;
          this.category=category;
          this.cricketerId=cricketerId;
          this.teamId=teamId;
 
         
 
         
      }
 
      displayInfo(){
          console.log(`Vote ID: ${this.voteId}`);
          console.log(`Email: ${this.email}`);
      }
 
 
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
}