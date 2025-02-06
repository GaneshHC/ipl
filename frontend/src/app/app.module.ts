import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
<<<<<<< HEAD
import { HTTP_INTERCEPTORS, HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';  
import { AuthInterceptor } from './auth.interceptors';
=======
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';  
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule 
  ],
<<<<<<< HEAD
  providers: [{
    provide: HTTP_INTERCEPTORS,
    useClass:AuthInterceptor,
    multi:true
  }],
=======
  providers: [],
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
  bootstrap: [AppComponent]
})
export class AppModule {}
