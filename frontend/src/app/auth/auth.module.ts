import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

import { AuthRoutingModule } from "./auth-routing.module";
import { ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import { RegistrationComponent } from "./components/registration/registration.component";
import { LoginComponent } from "./components/login/login.component";
import { LogoutComponent } from "./components/logout/logout.component";
import { RouterModule } from "@angular/router";

@NgModule({
  declarations: [RegistrationComponent,
    LoginComponent,
    LogoutComponent

  ],
  imports: [
    CommonModule,
    AuthRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule
  ],
  exports: [
    LogoutComponent
  ]
})
<<<<<<< HEAD
export class AuthModule {}
=======
export class AuthModule {}
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
