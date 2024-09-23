import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AddvehicleComponent } from './components/addvehicle/addvehicle.component';
import { DisplayallComponent } from './components/displayall/displayall.component';
import { SearchComponent } from './components/search/search.component';
import { UpdatevehicleComponent } from './components/updatevehicle/updatevehicle.component';

const routes: Routes = [

    {path: 'home',component:DashboardComponent},
    {path: 'addvehicle',component:AddvehicleComponent},
    {path: 'updatevehicle',component:UpdatevehicleComponent},
    {path: 'displayall',component:DisplayallComponent},
    {path: 'search/:input',component:SearchComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
