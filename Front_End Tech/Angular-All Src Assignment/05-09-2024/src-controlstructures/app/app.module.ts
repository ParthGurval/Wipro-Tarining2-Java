import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {FormsModule}  from '@angular/forms';
import { ControlstructuresComponent } from './controlstructures/controlstructures.component'

@NgModule({
  declarations: [       // components
    AppComponent, ControlstructuresComponent
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
