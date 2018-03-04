package nz.co.vilemob.rxmodel

import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.disposables.Disposables
import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.Subject

open class EventModel<E> {

    val eventObservable: Observable<E>
        get() = eventSubject

    private val eventSubject: Subject<E> = PublishSubject.create()

    fun publish(event: E) {
        eventSubject.onNext(event)
    }

    fun publish(eventObservable: Observable<E>): Disposable =
            eventObservable.subscribe { publish(it) }

    fun publish(vararg eventObservable: Observable<E>): Disposable =
            CompositeDisposable(eventObservable.map { publish(it) })

    open fun subscribe() = Disposables.empty()
}
