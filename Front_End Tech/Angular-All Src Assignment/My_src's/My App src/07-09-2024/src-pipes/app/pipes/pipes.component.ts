import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent {

  currentDate: Date = new Date();  // Data Pipes Example

  amount: number = 1234.56; // Currency Pipe Example

  percentageValue: number = 0.45; // Percentage Pipe Example

  number: number = 1234.56789; // Decimal Pipe Example

  message: string = 'Hello I am Parth and I am a Angular Developer!'; // Char Case Pipe Example

}
