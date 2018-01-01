package androidedu.io.patterns.observer


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 17.11.2018 - 07:24          │
//└─────────────────────────────┘

interface ValueObserver {
    fun onValueChange(oldText: String, newText: String)
}