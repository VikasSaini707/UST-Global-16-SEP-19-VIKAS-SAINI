import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { MoviesComponent } from './movies/movies.component';
import { RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { AddMovieComponent } from './addmovie/addmovie.component';

@ NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MoviesComponent,
    LoginComponent,
    AddMovieComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'movies' , component : MoviesComponent},
      {path : 'login' , component : LoginComponent},
      {path : 'addmovie' , component : AddMovieComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
