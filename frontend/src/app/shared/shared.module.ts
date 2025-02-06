import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
<<<<<<< HEAD
import { RouterModule } from '@angular/router';
import { AuthModule } from '../auth/auth.module';
import { NavBarComponent } from './navbar/navbar.component';

@NgModule({
  declarations: [NavBarComponent],
  imports: [
    CommonModule,
    RouterModule,
    AuthModule
  ],
  exports: [NavBarComponent]
})
export class SharedModule {}
=======
import { AuthModule } from '../auth/auth.module';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [
  ],
  imports: [
    CommonModule,
    AuthModule,
    RouterModule
  ],
  exports: [
  ]
})
export class SharedModule {}
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
