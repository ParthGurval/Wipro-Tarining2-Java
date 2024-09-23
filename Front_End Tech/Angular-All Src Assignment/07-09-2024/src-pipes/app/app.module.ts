import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {FormsModule}  from '@angular/forms';
import { SqrtPipe } from './sqrt.pipe';

import { PipesComponent } from './pipes/pipes.component'
import { ReversePipe } from './pipes/reverse.pipe'

@NgModule({
  declarations: [       // components
    AppComponent, SqrtPipe, ReversePipe, PipesComponent
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
