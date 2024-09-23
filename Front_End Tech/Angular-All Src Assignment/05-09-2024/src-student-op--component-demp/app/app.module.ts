import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {FormsModule}  from '@angular/forms';
import { StudentComponent } from './student/student.component'

@NgModule({
  declarations: [       // components
    AppComponent, StudentComponent
  ],
  imports: [          // modules
    BrowserModule,
    AppRoutingModule,
    FormsModule

  ],
  providers: [],   // service classes
  bootstrap: [AppComponent]    //add StudentComponent   here
})
export class AppModule { }
