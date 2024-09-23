import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {ReactiveFormsModule}  from '@angular/forms'

@NgModule({
  declarations: [       // components
    AppComponent
  ],
  imports: [          // modules
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule

  ],
  providers: [],   // service classes
  bootstrap: [AppComponent]
})
export class AppModule { }
