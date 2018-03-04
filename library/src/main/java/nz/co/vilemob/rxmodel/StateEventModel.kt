package nz.co.vilemob.rxmodel

import io.reactivex.Observable
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.Subject

open class StateEventModel<S, E>(
        initialState: S,
        reducer: Reducer<S, E>
) : EventModel<E>() {
    private val stateSubject: Subject<S> = BehaviorSubject.create()
    val stateObservable: Observable<S> = stateSubject

    init {
        eventObservable.scan(initialState, reducer).subscribe(stateSubject)
    }
}
