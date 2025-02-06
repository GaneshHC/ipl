import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
<<<<<<< HEAD
import { CricketerCreateComponent } from './ipl/components/cricketercreate/cricketercreate.component';
=======
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1

const routes: Routes = [
  {
    path: 'auth',
    loadChildren: () => import('./auth/auth.module').then((m) => m.AuthModule),
  },
  {
    path: 'ipl',
    loadChildren: () => import('./ipl/ipl.module').then((m) => m.IplModule),
  },
  {
    path: '',
    pathMatch: 'full',
    redirectTo: '/auth',  // Redirect to 'auth' route by default
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
