import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetoxplanComponent } from './detoxplan.component';

describe('DetoxplanComponent', () => {
  let component: DetoxplanComponent;
  let fixture: ComponentFixture<DetoxplanComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetoxplanComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetoxplanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
