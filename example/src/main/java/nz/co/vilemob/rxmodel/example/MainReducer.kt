package nz.co.vilemob.rxmodel.example

import nz.co.vilemob.rxmodel.Reducer

/**
 * Created by Leandro on 25/02/2018.
 */
object MainReducer : Reducer<MainState, MainEvents> {
    override fun apply(state: MainState, event: MainEvents) = when (event) {
        MainEvents.Increment -> state.run {
            copy(count = count + 1)
        }
    }
}