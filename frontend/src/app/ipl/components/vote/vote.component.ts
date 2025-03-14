import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
<<<<<<< HEAD
import { IplService } from '../../services/ipl.service';
import { Cricketer } from '../../types/Cricketer';
import { Team } from '../../types/Team';
import { Vote } from '../../types/Vote';
import { HttpErrorResponse } from '@angular/common/http';
=======
import { Vote } from '../../types/Vote';
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1

@Component({
  selector: 'app-vote',
  templateUrl: './vote.component.html',
  styleUrls: ['./vote.component.scss']
})
export class VoteComponent implements OnInit {
  voteForm!: FormGroup;
  vote: Vote | null = null;
  successMessage: string | null = null;
  errorMessage: string | null = null;
<<<<<<< HEAD
  teams: Team[] = [];
  cricketers: Cricketer[] = [];
  
  constructor(
    private formBuilder: FormBuilder,
    private iplService: IplService
  ) {}

  ngOnInit(): void {
    this.loadTeams();
    this.loadCricketers();
    this.voteForm = this.formBuilder.group({
      email: ['', [Validators.required, Validators.email]],
      category: ['', Validators.required],
      cricketer: [null],
      team: [null]
    });
    // Subscribe to category changes and update validators accordingly
    this.voteForm.get('category')?.valueChanges.subscribe((category) => {
      this.updateValidators(category);
    });
  }

  updateValidators(category: string): void {
    const cricketerControl = this.voteForm.get('cricketer');
    const teamControl = this.voteForm.get('team');

    cricketerControl?.clearValidators();
    teamControl?.clearValidators();

    // If category is Cricketer, make cricketer required, and clear team
    if (category === 'Cricketer') {
      cricketerControl?.setValidators([Validators.required]);
      teamControl?.clearValidators();
    } 
    // If category is Team, make team required, and clear cricketer
    else if (category === 'Team') {
      teamControl?.setValidators([Validators.required]);
      cricketerControl?.clearValidators();
    }

    // Update the value and validity for both controls
    cricketerControl?.updateValueAndValidity();
    teamControl?.updateValueAndValidity();
  }
  
  loadTeams(): void {
    this.iplService.getAllTeams().subscribe((teams) => {
      this.teams = teams;
    });
  }

  loadCricketers(): void {
    this.iplService.getAllCricketers().subscribe((cricketers) => {
      this.cricketers = cricketers;
=======

  constructor(private formBuilder: FormBuilder) {}

  ngOnInit(): void {
    this.voteForm = this.formBuilder.group({
      voteId: [null, Validators.required],
      email: ['', [Validators.required, Validators.email]],
      category: ['', Validators.required],
      cricketerId: [null, Validators.required],
      teamId: [null, Validators.required]
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
    });
  }

  onSubmit(): void {
    if (this.voteForm.valid) {
<<<<<<< HEAD
      this.castVote();
    } else {
      this.errorMessage = 'Please fill out all required fields correctly.';
      this.successMessage = null;
    }
  }

  private castVote(): void {
    this.iplService.createVote(this.voteForm.value).subscribe(
      (response: Vote) => {
        this.successMessage = 'Vote casted successfully!';
        this.errorMessage = null;
        this.resetForm();
      },
      (error: HttpErrorResponse) => {
        this.handleError(error);
      }
    );
  }

  resetForm(): void {
    this.voteForm.reset();
  }

  private handleError(error: HttpErrorResponse): void {
    if (error.error instanceof ErrorEvent) {
      this.errorMessage = `Client-side error: ${error.error.message}`;
    } else {
      this.errorMessage = `Server-side error: ${error.status} ${error.message}`;
      if (error.status === 400) {
        this.errorMessage = 'Bad request. Please check your input.';
      }
    }
    this.successMessage = null;
    console.error('An error occurred:', this.errorMessage);
  }
}
=======
      this.vote = this.voteForm.value;
      this.successMessage = 'Vote submitted successfully!';
      this.errorMessage = null;
      console.log(this.vote);
      this.resetForm();
    } else {
      this.successMessage = null;
      this.errorMessage = 'Please fill out all required fields correctly.';
    }
  }

  resetForm(): void {
    this.voteForm.reset();
  }
}
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
