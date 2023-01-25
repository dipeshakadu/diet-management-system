import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WLplanComponent } from './wlplan.component';

describe('WLplanComponent', () => {
  let component: WLplanComponent;
  let fixture: ComponentFixture<WLplanComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WLplanComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(WLplanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
