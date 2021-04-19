import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Subject } from 'rxjs';
import {
  debounceTime, distinctUntilChanged, tap
} from 'rxjs/operators';

@Component({
  selector: 'app-search-bar',
  templateUrl: './search-bar.component.html',
  styleUrls: ['./search-bar.component.css']
})
export class SearchBarComponent implements OnInit {

  @Output() term = new EventEmitter<string>();
  private debouncedSearchStream = new Subject<string>();

  constructor() { }


  ngOnInit(): void {
    this.debouncedSearchStream.pipe(
      debounceTime(300),
      distinctUntilChanged(),
      tap(t=>this.term.emit(t))
    ).subscribe();    
  }

  debounce(text : string){
    this.debouncedSearchStream.next(text)
  }

}
