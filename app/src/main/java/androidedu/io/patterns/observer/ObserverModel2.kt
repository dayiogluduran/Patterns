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

class ObserverModel2(val onValueObserver: (String, String) -> Unit) {

    var text: String by Delegates.observable(
        initialValue = "Gökhan",
        onChange = { prop, oldText, newText ->

            onValueObserver(oldText, newText)
        }
    )
}