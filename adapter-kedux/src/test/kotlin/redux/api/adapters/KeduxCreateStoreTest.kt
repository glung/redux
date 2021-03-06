package redux.api.adapters

import org.jetbrains.spek.api.Spek
import redux.api.Reducer
import redux.api.Store
import redux.api.helpers.Todos.State
import redux.api.makeCreateStoreTests


class KeduxCreateStoreTest : Spek(makeCreateStoreTests(storeCreator()))

private fun storeCreator() = { reducer: Reducer<State>, initialState: State, enhancer: Store.Enhancer? ->
    KeduxStoreAdapter.create(reducer, initialState, enhancer)
}
