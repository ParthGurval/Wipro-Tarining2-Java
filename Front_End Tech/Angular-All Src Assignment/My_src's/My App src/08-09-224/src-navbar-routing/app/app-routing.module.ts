import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactusComponent } from './contactus/contactus.component';
import { AboutmeComponent } from './aboutme/aboutme.component';
import { RegisterFormComponent } from './register-form/register-form.component';
import { TechstackComponent } from './techstack/techstack.component';

const routes: Routes = [ 
  
                {"path":'home' , component:HomeComponent} ,
                {"path":'contact',component:ContactusComponent },
                {"path":'aboutme',component:AboutmeComponent},
                {"path":'register',component:RegisterFormComponent},
                {"path":'tech',component:TechstackComponent}

                        ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
