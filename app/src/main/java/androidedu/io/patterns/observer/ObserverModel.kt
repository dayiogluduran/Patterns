package androidedu.io.patterns.observer

import kotlin.properties.Delegates


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 17.11.2018 - 07:26          │
//└─────────────────────────────┘

class ObserverModel(private val valueObserver: ValueObserver) {

    var text: String by Delegates.observable(
        initialValue = "Gökhan",
        onChange = { prop, oldText, newText ->

            valueObserver.onValueChange(oldText, newText)
        }
    )
}