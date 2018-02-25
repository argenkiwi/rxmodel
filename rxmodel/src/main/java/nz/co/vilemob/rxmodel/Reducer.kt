package nz.co.vilemob.rxmodel

import io.reactivex.functions.BiFunction

interface Reducer<S, E> : BiFunction<S, E, S> {
    override fun apply(state: S, event: E): S
}