package androidedu.io.patterns.mvvm.viewmodel

import androidedu.io.patterns.BR
import androidedu.io.patterns.mvvm.model.User
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import java.util.*


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 17.11.2018 - 08:09          │
//└─────────────────────────────┘

class UserViewModel(private val user: User) : Observer, BaseObservable() {

    init {
        user.addObserver(this)
    }

    override fun update(observable: Observable?, any: Any?) {
        if (any is String) {
            if (any == "age") {
                notifyPropertyChanged(BR.age)
            } else if (any == "firstName" || any == "lastName") {
                notifyPropertyChanged(BR.name)
            } else if (any == "imageUrl") {
                notifyPropertyChanged(BR.imageUrl)
            } else if (any == "tagline") {
                notifyPropertyChanged(BR.tagline)
            } else if (any == "female") {
                notifyPropertyChanged(BR.gender)
            }
        }
    }

    val name: String
        @Bindable get() {
            return user.firstName + " " + user.lastName
        }

    val age: String
        @Bindable get() {
            return if (user.age <= 0) return ""
            else String.format(Locale.ENGLISH, "%d years old", user.age)
        }

    val gender: String
        @Bindable get() {
            return if (user.female) return "Female" else "Male"
        }

    val imageUrl: String
        @Bindable get() {
            return user.imageUrl
        }

    val tagline: String
        @Bindable get() {
            return "Tagline: " + user.tagline
        }

    fun onButtonClick() {
        this.user.age = 35
        this.user.imageUrl = "https://media.giphy.com/media/w7M8g9cTom0Du/giphy.gif"
        this.user.tagline = "Now he has grown up..."
    }
}