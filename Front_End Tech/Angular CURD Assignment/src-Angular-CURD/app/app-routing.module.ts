import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddemployeeComponent } from './components/addemployee/addemployee.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { DeleteemployeeComponent } from './components/deleteemployee/deleteemployee.component';
import { DisplayallemployeeComponent } from './components/displayallemployee/displayallemployee.component';
import { UpdateemployeeComponent } from './components/updateemployee/updateemployee.component';

const routes: Routes = [

  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
  // { path: 'dashboard', component: DashboardComponent },
  { path: 'add-employee', component: AddemployeeComponent },
  { path: 'update-employee', component: UpdateemployeeComponent },
  { path: 'display-all', component: DisplayallemployeeComponent },
  { path: 'delete-employee', component: DeleteemployeeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
