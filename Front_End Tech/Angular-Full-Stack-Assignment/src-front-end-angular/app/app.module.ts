import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule}  from '@angular/common/http'

import {FormsModule}  from '@angular/forms'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AddvehicleComponent } from './components/addvehicle/addvehicle.component';
import { DisplayallComponent } from './components/displayall/displayall.component';
import { SearchComponent } from './components/search/search.component';
import { UpdatevehicleComponent } from './components/updatevehicle/updatevehicle.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    AddvehicleComponent,
    DisplayallComponent,
    SearchComponent,
    UpdatevehicleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
