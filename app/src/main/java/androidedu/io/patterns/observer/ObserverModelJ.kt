package androidedu.io.patterns.observer


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 17.11.2018 - 07:26          │
//└─────────────────────────────┘

class ObserverModelJ(private val valueObserver: ValueObserver) {

    var text: String = "Gökhan"
        set(value) {
            valueObserver.onValueChange(text, value)
            field = value
        }
}