package nz.co.vilemob.rxmodel.example

import androidx.lifecycle.LiveDataReactiveStreams
import androidx.lifecycle.ViewModel
import io.reactivex.BackpressureStrategy
import nz.co.vilemob.rxmodel.StateEventModel

class MainViewModel : ViewModel() {
    private val stateEventModel = StateEventModel(MainState(0), MainReducer)

    val liveState = LiveDataReactiveStreams.fromPublisher(
            stateEventModel.stateObservable.toFlowable(BackpressureStrategy.LATEST)
    )

    fun onIncrement() {
        stateEventModel.publish(MainEvents.Increment)
    }
}
