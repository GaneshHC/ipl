<<<<<<< HEAD
import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { catchError, throwError } from 'rxjs';
import { IplService } from '../../services/ipl.service';
import { Cricketer } from '../../types/Cricketer';
import { Team } from '../../types/Team';

@Component({
  selector: 'app-cricketercreate',
  templateUrl: './cricketercreate.component.html',
  styleUrls: ['./cricketercreate.component.scss']
})
export class CricketerCreateComponent implements OnInit {
  cricketerForm!: FormGroup;
  cricketer: Cricketer | null = null;
  successMessage: string | null = null;
  errorMessage: string | null = null;
  teams: Team[] = [];

  constructor(
      private formBuilder: FormBuilder,
      private iplService: IplService
    ) {}

  ngOnInit(): void {
    this.loadTeams();
    this.cricketerForm = this.formBuilder.group({
      team: [null, Validators.required],
      cricketerName: ['', Validators.required],
      age: [null, [Validators.required, Validators.min(18)]],
      nationality: ['', Validators.required],
      experience: [null, [Validators.required, Validators.min(0)]],
      role: ['', Validators.required],
      totalRuns: [null, [Validators.min(0)]],
      totalWickets: [null, [Validators.min(0)]],
    });
  }

  loadTeams(): void {
    this.iplService.getAllTeams().subscribe((teams) => {
      this.teams = teams;
    });
=======
import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormGroup, ValidationErrors, ValidatorFn, Validators } from '@angular/forms';
import { Cricketer } from '../../types/Cricketer';
// import { passwordValidator, usernameValidator } from './validators'; // Adjust the import path as needed

@Component({
    selector: 'app-cricketercreate',
      templateUrl: './cricketercreate.component.html',
      styleUrls: ['./cricketercreate.component.scss']
})
export class CricketerCreateComponent implements OnInit {
  cricketerForm!: FormGroup;
  successMessage: string | null = null;
  errorMessage: string | null = null;
  cricketer!:Cricketer;
  constructor(private formBuilder: FormBuilder) {}

  ngOnInit(): void {
    this.cricketerForm = this.formBuilder.group({
      cricketerId: [null, Validators.required],
      teamId: [null, Validators.required],
      cricketerName: ['', [Validators.required, this.usernameValidator()]],
      age: [null, [Validators.required, Validators.min(18)]],
      nationality: ['', Validators.required],
      experience: [null, [Validators.required, Validators.min(0)]], // Ensure non-negative experience
      role: ['', Validators.required],
      totalRuns: [null, Validators.min(0)],
      totalWickets: [null, Validators.min(0)]
    });
  }

usernameValidator(): ValidatorFn {
    return (control: AbstractControl): ValidationErrors | null => {
      const username = control.value;
      if (!username) {
        return null;
      }
      const hasSpecialChar = /[^a-zA-Z0-9]/.test(username);
      if (hasSpecialChar) {
        return { 'usernameInvalid': true };
      }
      return null;
    };
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
  }

  onSubmit(): void {
    if (this.cricketerForm.valid) {
<<<<<<< HEAD
      this.iplService.addCricketer(this.cricketerForm.value).subscribe({
        next: (response) => {
          this.cricketer = response;
          this.errorMessage = null;
          console.log(this.cricketer);
          this.cricketerForm.reset();
        },
        error: (error) => {
          this.handleError(error);
        },
        complete: () => {
          this.successMessage = 'Cricketer created successfully!';
        }
      });
    }
  }

  private handleError(error: HttpErrorResponse): void {
    if (error.error instanceof ErrorEvent) {
      // Client-side error
      this.errorMessage = `Client-side error: ${error.error.message}`;
    } else {
      // Backend error
      this.errorMessage = `Server-side error: ${error.status} ${error.message}`;
      // Optionally, you can handle different status codes here
      if (error.status === 400) {
        this.errorMessage = 'Bad request. Please check your input.';
      }
    }
    this.successMessage = null;
  }
}
=======
      this.cricketer = this.cricketerForm.value
      this.successMessage = 'Cricketer created successfully!';
      console.log(this.cricketerForm.value);
      this.resetForm();
      this.errorMessage = null;
    } else {
      this.errorMessage = 'Please fill out all required fields correctly.';
      this.successMessage = null;
    }
  }

  resetForm(): void {
    this.cricketerForm.reset();
  }
}
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
