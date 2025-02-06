<<<<<<< HEAD

export class Team {
  teamId:number;
  teamName:string;
  location:string;
  ownerName:string;
  establishmentYear:number;
  constructor(teamId:number,teamName:string,location:string,ownerName:string,establishmentYear:number){
    this.teamId= teamId;
    this.teamName =teamName;
    this.location = location;
    this.ownerName = ownerName;
    this.establishmentYear = establishmentYear;
  }
  displayInfo():void{
    console.log(`Team ID: ${this.teamId}`);
    console.log(`Team Name: ${this.teamName}`);
    console.log(`Location: ${this.location}`);
  }
}
=======
// export class Team {

//     teamId : number;
//     teamName : string;
//     location : string;
//     ownerName : string;
//     establishmentYear : number;

//     constructor(teamId:number , teamName:string , location:string , ownerName:string , establishmentYear:number){

//         this.teamId = teamId;
//         this.teamName = teamName;
//         this.location = location;
//         this.ownerName = ownerName;
//         this.establishmentYear = establishmentYear;
//     }

//     displayInfo() : void {
//         console.log(`Team ID: ${this.teamId}`);
//         console.log(`Team Name: ${this.teamName}`);
//         console.log(`Location: ${this.location}`);
//         // console.log(`Owner Name: ${this.ownerName}`);
//         // console.log(`Establishment Year: ${this.establishmentYear}`);
//     }
// }


export class Team {
    teamId:number;
    teamName:string;
    location:string;
    ownerName:string;
    establishmentYear:number
   
    constructor(teamId:number,teamName:string,location:string,ownerName:string,establishmentYear:number){
          this.teamId=teamId;
          this.teamName=teamName;
          this.location=location;
          this.ownerName=ownerName;
          this.establishmentYear=establishmentYear;
      }
   
      displayInfo(){
          console.log(`Team ID: ${this.teamId}`);
          console.log(`Team Name: ${this.teamName}`);
          console.log(`Location: ${this.location}`);
      }
  }
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
