import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DiabetesplanComponent } from './diabetesplan.component';

describe('DiabetesplanComponent', () => {
  let component: DiabetesplanComponent;
  let fixture: ComponentFixture<DiabetesplanComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DiabetesplanComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DiabetesplanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
