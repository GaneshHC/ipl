import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

import { IplRoutingModule } from "./ipl-routing.module";
<<<<<<< HEAD
import { ReactiveFormsModule } from "@angular/forms";
=======
import { FormGroup, FormsModule, ReactiveFormsModule } from "@angular/forms";
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
import { HttpClientModule } from "@angular/common/http";
import { TeamCreateComponent } from "./components/teamcreate/teamcreate.component";
import { CricketerCreateComponent } from "./components/cricketercreate/cricketercreate.component";
import { MatchCreateComponent } from "./components/matchcreate/matchcreate.component";
<<<<<<< HEAD
import { TicketBookingComponent } from "./components/ticketbooking/ticketbooking.component";
import { VoteComponent } from "./components/vote/vote.component";
import { RouterModule } from "@angular/router";
import { SharedModule } from "../shared/shared.module";
import { DashboardComponent } from "./components/dashboard/dashboard.component";
import { CricketerEditComponent } from "./components/cricketeredit/cricketeredit.component";
import { TeamEditComponent } from "./components/teamedit/teamedit.component";
import { MatchEditComponent } from "./components/matchedit/matchedit.component";
=======
import { Match } from "./types/Match";
import { RouterModule } from "@angular/router";
import { TicketBookingComponent } from "./components/ticketbooking/ticketbooking.component";
import { VoteComponent } from "./components/vote/vote.component";
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1

@NgModule({
  declarations: [
    TeamCreateComponent,
    CricketerCreateComponent,
    MatchCreateComponent,
    TicketBookingComponent,
    VoteComponent,
<<<<<<< HEAD
    DashboardComponent,
    CricketerEditComponent,
    TeamEditComponent,
    MatchEditComponent
=======
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    HttpClientModule,
    IplRoutingModule,
<<<<<<< HEAD
    RouterModule,
    SharedModule
=======
    RouterModule
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
  ],
  exports: [
    
  ]
})
export class IplModule {}
