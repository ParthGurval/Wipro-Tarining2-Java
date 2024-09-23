import { Component } from '@angular/core';

@Component({
  selector: 'app-demo',
  template: '<h1>Hello I am Demo</h1>',
  styles: ['h1{color:blue;}' , 'h1{background-color:red}'],
  providers:[]  // service class which is personal or private to DemoComponent only
})
export class DemoComponent {

}
