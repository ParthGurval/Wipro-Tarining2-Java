import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ControlstructuresComponent } from './controlstructures.component';

describe('ControlstructuresComponent', () => {
  let component: ControlstructuresComponent;
  let fixture: ComponentFixture<ControlstructuresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ControlstructuresComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ControlstructuresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
