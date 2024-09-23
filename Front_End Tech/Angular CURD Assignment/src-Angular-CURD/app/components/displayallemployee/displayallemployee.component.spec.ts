import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayallemployeeComponent } from './displayallemployee.component';

describe('DisplayallemployeeComponent', () => {
  let component: DisplayallemployeeComponent;
  let fixture: ComponentFixture<DisplayallemployeeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplayallemployeeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayallemployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
