<<<<<<< HEAD
import { Component } from "@angular/core";
import { Cricketer } from "../../types/Cricketer";

@Component({
    selector: 'app-cricketersample',
  standalone: true,
  imports:[],
    templateUrl:'./cricketersample.component.html',
    styleUrls:['./cricketersample.component.scss']
})

export class CricketerSampleComponent {
  cricketer: Cricketer = new Cricketer(1,1,"Virat",32,"Indian",14,"Batsman",580,50);
}
=======
 
import { Component } from "@angular/core";
import { Cricketer } from "../../types/Cricketer";
 
@Component({
    selector:'app-cricketersample',
    standalone:true,
    imports:[],
    templateUrl:'./cricketersample.component.html',
    styleUrls:['./cricketersample.component.scss'],
})
export class CricketerSampleComponent {
    cricketer :Cricketer = new Cricketer(1,1,"Virat",32,"Indian",14,"Batsman",580,5);
}
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
