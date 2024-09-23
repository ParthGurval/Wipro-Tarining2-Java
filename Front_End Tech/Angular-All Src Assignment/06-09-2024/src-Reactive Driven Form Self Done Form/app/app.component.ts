import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'myCourse',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  title = 'My Course App';

  registerForm!: FormGroup;

  submitted = false;
  validCourses = true;

  courseOptions = [' Java', ' Python', ' Angular', ' ReactJS', ' AWS', ' Docker'];

  constructor(private formBuilder: FormBuilder) {

  }

  ngOnInit(): void {

    this.registerForm = this.formBuilder.group({

      userId: ['', [Validators.required, Validators.minLength(6), Validators.maxLength(100)]],

      username: ['', [Validators.required, Validators.minLength(6), Validators.maxLength(100)]],

      email: ['', [Validators.required, Validators.email]],

      password: ['', [Validators.required, Validators.minLength(4), Validators.maxLength(10), Validators.pattern("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).{8,30}$")]],

      mobile: ['', [Validators.required, Validators.minLength(10), Validators.maxLength(10)]],

      gender: ['', Validators.required],

      courses: this.formBuilder.array([], Validators.required)

    });
  }

  get f() {

    return this.registerForm.controls;
  }

  onCourseChange(event: any) {

    const coursesArray = this.registerForm.get('courses');
    const course = event.target.value;

    if (event.target.checked) {

      coursesArray?.value.push(course);
    } 
    
    else {

      const index = coursesArray?.value.indexOf(course);

      if (index > -1) {

        coursesArray?.value.splice(index, 1);
      }
    }
    this.validCourses = coursesArray?.value.length >= 2;
  }

  onSubmit() {

    this.submitted = true;

    if (this.registerForm.invalid || !this.validCourses) {

      return;
    }

    alert('Registration Successful');

    console.log(this.registerForm.value);
  }

  passwordHasError(type: string): boolean {
    const passwordControl = this.f['password'];
    if (!passwordControl.errors?.['pattern']) return false;
    const value = passwordControl.value;
    switch (type) {
      case 'uppercase':
        return !/[A-Z]/.test(value);
      case 'lowercase':
        return !/[a-z]/.test(value);
      case 'number':
        return !/\d/.test(value);
      case 'special':
        return !/[!@#$%^&*(),.?":{}|<>]/.test(value);
      default:
        return false;
    }
  }
}
