import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Match } from '../../types/Match';

@Component({
  selector: 'app-matchcreate',
  templateUrl: './matchcreate.component.html',
  styleUrls: ['./matchcreate.component.scss']
})
export class MatchCreateComponent implements OnInit {
  matchForm!: FormGroup;
  match: Match | null = null;
  successMessage: string | null = null;
  errorMessage: string | null = null;

  constructor(private formBuilder: FormBuilder) {}

  ngOnInit(): void {
    this.matchForm = this.formBuilder.group({
      matchId: [null, Validators.required],
      firstTeamId: [null, Validators.required],
      secondTeamId: [null, Validators.required],
      matchDate: [null, Validators.required],
      venue: ['', Validators.required],
      result: ['', Validators.required],
      status: ['', Validators.required],
      winnerTeamId: [null, Validators.required]
    });
  }

  onSubmit(): void {
    if (this.matchForm.valid) {
      this.match = this.matchForm.value;
      this.successMessage = 'Match created successfully!';
      console.log(this.match);
      this.resetForm();
      this.errorMessage = null;
    } else {
      this.errorMessage = 'Please fill out all required fields correctly.';
      this.successMessage = null;
    }
  }

  resetForm(): void {
    this.matchForm.reset();
  }
}
