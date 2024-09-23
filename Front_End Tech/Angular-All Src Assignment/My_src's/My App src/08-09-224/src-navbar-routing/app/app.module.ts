import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {FormsModule}  from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { ContactusComponent } from './contactus/contactus.component';
import { TechstackComponent } from './techstack/techstack.component';
import { AboutmeComponent } from './aboutme/aboutme.component';
import { RegisterFormComponent } from './register-form/register-form.component'


@NgModule({
  declarations: [       // components
    AppComponent, HomeComponent, ContactusComponent, TechstackComponent, AboutmeComponent, RegisterFormComponent
  ],
  imports: [          // modules
    BrowserModule,
    AppRoutingModule,
    FormsModule

  ],
  providers: [],   // service classes
  bootstrap: [AppComponent]
})
export class AppModule { }
