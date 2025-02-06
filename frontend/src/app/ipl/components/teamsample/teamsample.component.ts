import { Component } from "@angular/core";
import { Team } from "../../types/Team";
<<<<<<< HEAD
@Component({
    selector: 'app-teamsample',
    standalone: true,
  imports:[],
    templateUrl:'./teamsample.component.html',
    styleUrls:['./teamsample.component.scss']
})

export class TeamSampleComponent  {
  team: Team = new Team(1,"CSK","Chennai","Dhoni",2015);
}
=======
 
@Component({
    selector: 'app-teamsample',
    standalone: true,
    imports: [],
    templateUrl: './teamsample.component.html',
    styleUrls:['./teamsample.component.scss']
 
})
export class TeamSampleComponent  {
team: Team = new Team(1,"CSK","Chennai","Dhoni",2015);
 
}
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
